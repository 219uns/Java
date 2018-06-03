package com.reflection._3_loadresource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
//加载资源文件
public class LoadResourceDemo {
    public static void main(String[] args) throws Exception{
            test1();
            test2();
            test3();
    }

    //方式一：使用绝对路径的方式加载-不好
    private static void test1() throws Exception{
    Properties p = new Properties();
        FileInputStream inputStream = new FileInputStream("/Users/daiquanming/Codes/_javapractice/src/db.properties");
        p.load(inputStream);
        System.out.println("方式一："+ p);
    }
//    方式二：使用相对路径-相对于classpathd额根路径（bin目录-字节码输出目录）

    //    此时得使用ClassLoader(类加载器)，类加载器默认就是从classpath根路径去寻找文件；
    private static void test2() throws Exception{
        Properties p = new Properties();
//        获取ClassLoader对象的两种方式：
//        ClassLoader loader = LoadResourceDemo.class.getClassLoader();
        ClassLoader loader =Thread.currentThread().getContextClassLoader();
        InputStream input = loader.getResourceAsStream("db.properties");
        p.load(input);//加载
        System.out.println("方式二"+p);//{username=root}
        System.out.println(p.get("username"));//root
    }

//    使用相对路径-想对于当前加载资源文件(此处为LoadResourceDemo类)的字节码路径
    private static void test3() throws Exception{
        Properties p = new Properties();
        InputStream inputStream = LoadResourceDemo.class.getResourceAsStream("db.properties");//从当前类路径去寻找
        p.load(inputStream);
        System.out.println("方式三："+ p);
    }
}
