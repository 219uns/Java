package com.reflection._1_constructor;

import java.lang.reflect.Constructor;

public class _0_GetConstructor {
    public static void main(String[] args) throws Exception{
//        获取所有的构造器
        getAlls();
//        获取指定的一个构造器
        getAppoint();
    }
    private static void getAlls() {
//        1.获取构造器所在类的字节码对象
        Class clz = User.class;
//        2.获取clz对象中所有的构造器
//        该方法只能获取当前Class所表示类的public修饰的构造器；
        Constructor<User>[] cons = clz.getConstructors();
        System.out.println(cons.length);//2
        for (Constructor c : cons) {
            System.out.println(c);
            //public com.reflection._1_constructor.User()
            //public com.reflection._1_constructor.User(java.lang.String)
        }
        System.out.println("------------------------------");
//        获取当前Class所表示类的所有构造器，和访问权限无关；
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
//        1.获取构造器所在类的字节码对象
        Class clz = User.class;
//        需求1：获取public User()
        Constructor<User> con = clz.getConstructor();
        System.out.println(con);//public com.reflection._1_constructor.User()

//        需求2：获取public User(String name)
        con = clz.getConstructor(String.class);
        System.out.println(con);

//        需求3：获取public User(String name ,int age)
//        con = clz.getConstructor(String.class,int.class);//报错：Exception in thread "main" java.lang.NoSuchMethodException:
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