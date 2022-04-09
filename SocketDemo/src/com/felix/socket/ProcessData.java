package com.felix.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 该类主要用来处理发送数据和接收数据
 */
public class ProcessData {

    /**
     * 处理接收数据
     * @param is 输入流
     * @return 返回收到的数据
     */
    public String receiveData(InputStream is) {
        String bufferData = "";
        try {
            // 报文长度标识自身的长度
            int headLength = 8;
            byte[] headBuffer = new byte[headLength];

            // 从输入流中读取报文长度标识
            for (int offset = 0; offset < headLength; ) {
                int length = is.read(headBuffer, offset, headLength - offset);
                if (length < 0) {
                    throw new RuntimeException("非法的报文头长度");
                }
                offset += length;
            }

            String headStr = new String(headBuffer, StandardCharsets.UTF_8);
            System.out.println("收到的报文长度标识为：" + headStr);

            int bodyLength = Integer.parseInt(headStr);
            byte[] bodyBuffer = new byte[bodyLength];
            for (int offset = 0; offset < bodyLength; ) {
                int length = is.read(bodyBuffer, offset, bodyLength - offset);
                if (length < 0) {
                    throw new RuntimeException("非法的报文数据");
                }
                offset += length;
            }
            bufferData = new String(bodyBuffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferData;
    }

    /**
     * 发送数据
     * @param os 输出流
     * @param msgData 待发送的消息
     */
    public void sendData(OutputStream os, String msgData) {
        // 将待发送的消息转为字节数组
        byte[] body = msgData.getBytes(StandardCharsets.UTF_8);
        // 为了解决Tcp通讯的粘包问题，使用带长度标识的字节流报文进行通讯，报文长度标识为8位，不足8位左边补0
        String headLength = String.format("%08d", body.length);
        System.out.println("待发送的长度标识为：" + headLength);

        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            // 创建字节数组输出流对象
            byteArrayOutputStream = new ByteArrayOutputStream();
            // 先写入8位报文长度标识
            byteArrayOutputStream.write(headLength.getBytes(StandardCharsets.UTF_8));
            // 再写入待发送的消息体
            byteArrayOutputStream.write(body);
            // 将字节数组流写入输出流
            os.write(byteArrayOutputStream.toByteArray());
            // 刷新缓冲区
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭字节数组输出流
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    System.out.println("finally关闭ByteArrayOutputStream发生异常：" + e.getMessage());
                }
            }
        }
    }
}
