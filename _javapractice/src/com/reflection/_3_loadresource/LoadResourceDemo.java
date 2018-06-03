package com.reflection._3_loadresource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
//������Դ�ļ�
public class LoadResourceDemo {
    public static void main(String[] args) throws Exception{
            test1();
            test2();
            test3();
    }

    //��ʽһ��ʹ�þ���·���ķ�ʽ����-����
    private static void test1() throws Exception{
    Properties p = new Properties();
        FileInputStream inputStream = new FileInputStream("/Users/daiquanming/Codes/_javapractice/src/db.properties");
        p.load(inputStream);
        System.out.println("��ʽһ��"+ p);
    }
//    ��ʽ����ʹ�����·��-�����classpathd���·����binĿ¼-�ֽ������Ŀ¼��

    //    ��ʱ��ʹ��ClassLoader(�������)���������Ĭ�Ͼ��Ǵ�classpath��·��ȥѰ���ļ���
    private static void test2() throws Exception{
        Properties p = new Properties();
//        ��ȡClassLoader��������ַ�ʽ��
//        ClassLoader loader = LoadResourceDemo.class.getClassLoader();
        ClassLoader loader =Thread.currentThread().getContextClassLoader();
        InputStream input = loader.getResourceAsStream("db.properties");
        p.load(input);//����
        System.out.println("��ʽ��"+p);//{username=root}
        System.out.println(p.get("username"));//root
    }

//    ʹ�����·��-����ڵ�ǰ������Դ�ļ�(�˴�ΪLoadResourceDemo��)���ֽ���·��
    private static void test3() throws Exception{
        Properties p = new Properties();
        InputStream inputStream = LoadResourceDemo.class.getResourceAsStream("db.properties");//�ӵ�ǰ��·��ȥѰ��
        p.load(inputStream);
        System.out.println("��ʽ����"+ p);
    }
}
