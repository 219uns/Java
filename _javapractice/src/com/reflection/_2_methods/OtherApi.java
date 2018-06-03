package com.reflection._2_methods;

import java.lang.reflect.Modifier;

//�����������API
public abstract class OtherApi {
    public static void main(String[] args) {
//        ��ȡ���η�
        Class<OtherApi> clzz = OtherApi.class;
        int mod = clzz.getModifiers();//��������Ϊint?�鿴Modifier���ж��壬ʮ���������ƣ�
        System.out.println(mod);
        String s = Modifier.toString(mod);
        System.out.println(s);

//        ��ȡ����
        System.out.println(clzz.getName());//com.reflection._2_methods.OtherApi
        System.out.println(clzz.getSimpleName());//OtherApi

//        ��ȡ����
        System.out.println(clzz.getPackage());//package com.reflection._2_methods
        System.out.println(clzz.getPackage().getName());//com.reflection._2_methods

//        ��ȡ��������
        System.out.println(clzz.getSuperclass());//class java.lang.Object
        System.out.println(clzz.getSuperclass().getName());//java.lang.Object

    }
}
enum Gender{
     MAN,WOMAN,NONE;
}