package com.javaUtils._04_string;

import java.util.Arrays;

//String���еĳ��÷���
public class _02_MethodInString {
    public static void main(String[] args) {
//        buildAndTrans();//String�Ĵ�����ת������
//        getStringInfo();//��ȡ�ַ�����Ϣ
//        stringCompare();//�ַ����ıȽϲ���
        toUpper_lower();//��Сдת��
    }

    private static void toUpper_lower() {
        System.out.println("ABcDeF".toUpperCase());//ABCDEF
        System.out.println("ABcDeF".toLowerCase());//abcdef
    }

    private static void stringCompare() {
        String str1 = new String("ABCD");
        String str2 = new String("ABCD");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equalsIgnoreCase("abcd"));//true
        System.out.println(str1.contentEquals(str2));//true  ��equals()�ײ���ͬ��
    }

    private static void getStringInfo() {
        System.out.println("A BCD E".length());//7
        System.out.println("ABCD".charAt(3));//����ָ��������charֵ  D
        System.out.println("AVFDRDGGKAVBHK".indexOf("FD"));//2
        System.out.println("AVFDRDGGKAVBHK".lastIndexOf("AV"));//9
    }

    private static void buildAndTrans() {
        //String��char[]���໥ת��
        char[] cs = new char[]{'A','B','C'};
        String str1 = new String(cs);
        System.out.println(str1);
        System.out.println(str1.toCharArray());

        //byte[]��String���໥ת��
        System.out.println(Arrays.toString("ABC".getBytes()));//[65, 66, 67] ��ӡ���Ƕ�Ӧ��ASC�������
        System.out.println(new String("ABC".getBytes()));
    }
}
