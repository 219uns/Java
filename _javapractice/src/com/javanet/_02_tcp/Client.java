package com.javanet._02_tcp;

import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
//    创建客户端对象，并指明连接的服务端的主机和端口
        Socket client = new Socket("localhost",8888);
//        获取客户端的输入流对象
        Scanner sc = new Scanner(client.getInputStream());
        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        client.close();
    }
}
