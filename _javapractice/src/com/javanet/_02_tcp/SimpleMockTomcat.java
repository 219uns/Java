package com.javanet._02_tcp;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//简单模拟Tomcat服务器
public class SimpleMockTomcat {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(8888);
        while(1 == 1){
           Socket client  = server.accept();
            PrintStream  ps = new PrintStream(client.getOutputStream());
            Scanner sc = new Scanner(new FileInputStream("/Users/daiquanming/Codes/_javapractice/src/com/javanet/_02_tcp/helloHtml.html"));
            while(sc.hasNext()){
                ps.println(sc.nextLine());
            }
            sc.close();
        }
    }
}
