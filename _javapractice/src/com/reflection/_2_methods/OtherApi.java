package com.reflection._2_methods;

import java.lang.reflect.Modifier;

//反射其他相关API
public abstract class OtherApi {
    public static void main(String[] args) {
//        获取修饰符
        Class<OtherApi> clzz = OtherApi.class;
        int mod = clzz.getModifiers();//返回类型为int?查看Modifier类中定义，十分巧妙的设计；
        System.out.println(mod);
        String s = Modifier.toString(mod);
        System.out.println(s);

//        获取类名
        System.out.println(clzz.getName());//com.reflection._2_methods.OtherApi
        System.out.println(clzz.getSimpleName());//OtherApi

//        获取包名
        System.out.println(clzz.getPackage());//package com.reflection._2_methods
        System.out.println(clzz.getPackage().getName());//com.reflection._2_methods

//        获取父类名称
        System.out.println(clzz.getSuperclass());//class java.lang.Object
        System.out.println(clzz.getSuperclass().getName());//java.lang.Object

    }
}
enum Gender{
     MAN,WOMAN,NONE;
}