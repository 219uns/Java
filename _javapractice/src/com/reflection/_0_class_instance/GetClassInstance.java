package com.reflection._0_class_instance;

import java.util.Date;

//获取字节码对象（Class对象）
public class GetClassInstance {
    public static void main(String[] args) throws Exception {
//需求：获取java.util.Date类的字节码对象

//        方式一：使用class属性
        Class<java.util.Date> clz1 = java.util.Date.class;

//        方式二：通过对象的getClass方法来获取，getClass是Object类中的方法；返回次Object的运行时类
        java.util.Date date = new java.util.Date();
        Class<? extends Date> clz2 = date.getClass();
        Class<?> clz3 = date.getClass();

//        方式三：通过Class类中的静态方法forName(String className);
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
