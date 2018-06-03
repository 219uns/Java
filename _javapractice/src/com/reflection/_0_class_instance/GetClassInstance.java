package com.reflection._0_class_instance;

import java.util.Date;

//��ȡ�ֽ������Class����
public class GetClassInstance {
    public static void main(String[] args) throws Exception {
//���󣺻�ȡjava.util.Date����ֽ������

//        ��ʽһ��ʹ��class����
        Class<java.util.Date> clz1 = java.util.Date.class;

//        ��ʽ����ͨ�������getClass��������ȡ��getClass��Object���еķ��������ش�Object������ʱ��
        java.util.Date date = new java.util.Date();
        Class<? extends Date> clz2 = date.getClass();
        Class<?> clz3 = date.getClass();

//        ��ʽ����ͨ��Class���еľ�̬����forName(String className);
        Class clz4 =Class.forName("java.util.Date");

        System.out.println(clz1);
        System.out.println(clz2);
        System.out.println(clz3);
        System.out.println(clz4);

        System.out.println(clz1 == clz2);
        System.out.println(clz1 == clz3);
        System.out.println(clz3 == clz2);
        /*Console:
        class java.util.Date
        class java.util.Date
        class java.util.Date
        class java.util.Date
        true
        true
        true
        */
    }

}
