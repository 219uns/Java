package com.reflection._1_constructor;

import java.lang.reflect.Constructor;

public class _0_GetConstructor {
    public static void main(String[] args) throws Exception{
//        ��ȡ���еĹ�����
        getAlls();
//        ��ȡָ����һ��������
        getAppoint();
    }
    private static void getAlls() {
//        1.��ȡ��������������ֽ������
        Class clz = User.class;
//        2.��ȡclz���������еĹ�����
//        �÷���ֻ�ܻ�ȡ��ǰClass����ʾ���public���εĹ�������
        Constructor<User>[] cons = clz.getConstructors();
        System.out.println(cons.length);//2
        for (Constructor c : cons) {
            System.out.println(c);
            //public com.reflection._1_constructor.User()
            //public com.reflection._1_constructor.User(java.lang.String)
        }
        System.out.println("------------------------------");
//        ��ȡ��ǰClass����ʾ������й��������ͷ���Ȩ���޹أ�
        cons = clz.getDeclaredConstructors();
        System.out.println(cons.length);//3
        for (Constructor c : cons) {
            System.out.println(c);
            //public com.reflection._1_constructor.User()
            //public com.reflection._1_constructor.User(java.lang.String)
            //private com.reflection._1_constructor.User(java.lang.String,int)
        }
    }

    public static void getAppoint() throws Exception {
        System.out.println("------------------------------");
//        1.��ȡ��������������ֽ������
        Class clz = User.class;
//        ����1����ȡpublic User()
        Constructor<User> con = clz.getConstructor();
        System.out.println(con);//public com.reflection._1_constructor.User()

//        ����2����ȡpublic User(String name)
        con = clz.getConstructor(String.class);
        System.out.println(con);

//        ����3����ȡpublic User(String name ,int age)
//        con = clz.getConstructor(String.class,int.class);//����Exception in thread "main" java.lang.NoSuchMethodException:
//                                                                com.reflection._1_constructor.User.<init>(java.lang.String, int)
        con = clz.getDeclaredConstructor(String.class,int.class);
        System.out.println(con);
    }
}
class User{
    public User(){}

    public User(String name){}

    private User(String name ,int age){}
}