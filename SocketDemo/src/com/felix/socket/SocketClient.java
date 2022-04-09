package com.felix.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

    public static void main(String[] args) {
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            // 创建一个socket客户端，连接socket服务端的端口为：8888
            socket = new Socket("localhost", 8888);
            // 从控制台读取输入的消息
            Scanner scanner = new Scanner(System.in);
            System.out.println("我是客户端，已经启动成功，请输入要发送给服务端的消息：");

            ProcessData processData = new ProcessData();
            // 获取socket的输入流
            is = socket.getInputStream();

            if (scanner.hasNextLine()) {
                // 获取输入的消息
                String sendMsg = scanner.nextLine();
                // 获取socket的输出流
                os = socket.getOutputStream();
                // 向服务端发送消息
                processData.sendData(os, sendMsg);
            }

            // 获取服务端返回的消息
            String receiveMsg = processData.receiveData(is);
            System.out.println("我是客户端，接收到服务端响应的消息为：" + receiveMsg);
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
