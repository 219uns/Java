package com.javanet._03_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//发送端
public class Send {
    public static void main(String[] args) throws Exception{
        String data = "Hello Girl !";
//        创建发送端对象
        DatagramSocket sender = new DatagramSocket(10086);
//        发送数据
        DatagramPacket dp = new DatagramPacket(data.getBytes(),//发送的数据
                data.getBytes().length,//发送数据的长度（字节数）
                 InetAddress.getLocalHost(),//发送到哪一个IP
                10086);//发送给哪一个短裤程序
        sender.send(dp);
        sender.close();
    }
}
//Exception in thread "main" java.net.BindException: Address already in use (Bind failed)
//端口地址已经被占用，不能再绑定，端口冲突；