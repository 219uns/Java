package com.javanet._01_url_connection;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
    uri:统一资源标识符
    url:统一资源定位符
    都包含： 协议：//域名：端口/相对资源路径
    区别： 在Java中URI表示一个统一资源的标识符，不能用于定位任何资源，唯一的作用就是解析；
                而URL则包含一个可以打开到达该资源的输入流，可以简单理解URL是URI的特例；
*/
public class URI_URL {
    public static void main(String[] args) throws Exception {
//        创建URL对象：URL(String protocol, String host, int port, String file)
//        http://localhost:8080/index.jsp
//        注意：需要先 ./startup.sh 启动Tomcat
        URL url = new URL("http", "localhost", 8080, "/tomcat.png");
//        打开URL的连接对象
        URLConnection conn = url.openConnection();
//        InputStream getInputStream() 返回从此打开的连接读取输入流
 //        网络--->输入--->程序中
 InputStream inputStream = conn.getInputStream();
/**
 Scanner scanner = new Scanner(inputStream);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
 */
//        把tomcat.png图片保存在本地磁盘中(会保存到当前路径)
        Files.copy(inputStream, Paths.get("tomcat.png"));
    }
}
