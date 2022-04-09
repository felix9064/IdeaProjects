package com.felix.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketThread implements Runnable{

    private final Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 获取socket的输入流
            is = socket.getInputStream();
            // 获取socket的输出流
            os = socket.getOutputStream();

            ProcessData processData = new ProcessData();
            // 获取客户端发送的消息
            String receiveData = processData.receiveData(is);
            System.out.println("我是服务端，接收到客户端的消息为：" + receiveData);

            // 组装返回给客户端的消息
            String sendMsg = "服务端成功收到客户端消息，" + receiveData;
            // 返回消息给客户端
            processData.sendData(os, sendMsg);

            System.out.println("当前请求线程：" + Thread.currentThread().getName());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭输入流
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println("finally关闭InputStream发生异常：" + e.getMessage());
                }
            }
            // 关闭输出流
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    System.out.println("finally关闭OutputStream发生异常：" + e.getMessage());
                }
            }
            // 关闭socket
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("finally关闭socket发生异常：" + e.getMessage());
                }
            }
        }
    }
}
