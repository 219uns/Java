package com.javanet._01_ip;

import java.io.IOException;
import java.net.InetAddress;

public class InetAdressDemo {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddresses = InetAddress.getByName("MACBOOKPRO-2F0D");
        System.out.println(inetAddresses);
//      获取主机名
        System.out.println(inetAddresses.getHostName());
//        获取IP地址
        System.out.println(inetAddresses.getHostAddress());
//        返回本机ip
        System.out.println(InetAddress.getLocalHost());
//      是否可达（连接访问）
        System.out.println(InetAddress.getLocalHost().isReachable(1000));

    }
}
