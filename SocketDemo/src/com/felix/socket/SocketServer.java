package com.felix.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) {
        // 创建一个socket服务端，监听端口：8888
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("我是服务端，已经启动成功，客户端可以给我发消息了");
        // 记录连接过服务器的客户端的数量
        int count = 0;
        Socket socket = null;
        // 循环监听客户端请求
        while (true) {
            if (serverSocket != null) {
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
            }
            // 创建线程处理socket请求
            Thread thread = new Thread(new SocketThread(socket));
            thread.start();

            count++;
            System.out.println("服务端被客户端连接过的次数：" + count);

        }
    }
}
