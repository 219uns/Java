package com.javanet._02_tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //        创建服务端，指定端口
        ServerSocket server = new ServerSocket(8888);
        System.out.println("Server is ready ...");
//        接受连接该服务端的客户端对象
        Socket client = server.accept();
        System.out.println("which client :"+client.getInetAddress());
        boolean keepConnect = true;
while (keepConnect) {
//        获取该客户端的输出流对象，给该客户端输出数据
    PrintStream out = new PrintStream(client.getOutputStream());
    String data = "Hey man !";
    out.println(data);
    out.close();
    }
//        因为while死循环，此处会编译报错，为了绕开编译报错，定义变量keepCoonect
        server.close();
    }
}
