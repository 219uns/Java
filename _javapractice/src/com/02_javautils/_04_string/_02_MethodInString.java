package com.javaUtils._04_string;

import java.util.Arrays;

//String类中的常用方法
public class _02_MethodInString {
    public static void main(String[] args) {
//        buildAndTrans();//String的创建与转化操作
//        getStringInfo();//获取字符串信息
//        stringCompare();//字符串的比较操作
        toUpper_lower();//大小写转换
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
        System.out.println(str1.contentEquals(str2));//true  和equals()底层相同；
    }

    private static void getStringInfo() {
        System.out.println("A BCD E".length());//7
        System.out.println("ABCD".charAt(3));//返回指定索引的char值  D
        System.out.println("AVFDRDGGKAVBHK".indexOf("FD"));//2
        System.out.println("AVFDRDGGKAVBHK".lastIndexOf("AV"));//9
    }

    private static void buildAndTrans() {
        //String与char[]的相互转换
        char[] cs = new char[]{'A','B','C'};
        String str1 = new String(cs);
        System.out.println(str1);
        System.out.println(str1.toCharArray());

        //byte[]与String的相互转换
        System.out.println(Arrays.toString("ABC".getBytes()));//[65, 66, 67] 打印的是对应的ASC码表数据
        System.out.println(new String("ABC".getBytes()));
    }
}
