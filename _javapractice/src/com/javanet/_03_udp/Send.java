package com.javanet._03_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//���Ͷ�
public class Send {
    public static void main(String[] args) throws Exception{
        String data = "Hello Girl !";
//        �������Ͷ˶���
        DatagramSocket sender = new DatagramSocket(10086);
//        ��������
        DatagramPacket dp = new DatagramPacket(data.getBytes(),//���͵�����
                data.getBytes().length,//�������ݵĳ��ȣ��ֽ�����
                 InetAddress.getLocalHost(),//���͵���һ��IP
                10086);//���͸���һ���̿����
        sender.send(dp);
        sender.close();
    }
}
//Exception in thread "main" java.net.BindException: Address already in use (Bind failed)
//�˿ڵ�ַ�Ѿ���ռ�ã������ٰ󶨣��˿ڳ�ͻ��