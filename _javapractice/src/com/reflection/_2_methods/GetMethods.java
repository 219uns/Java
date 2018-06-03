package com.reflection._2_methods;

import java.lang.reflect.Method;

//使用反射获取类中方法
public class GetMethods {
    public static void main(String[] args) throws Exception {
        getAllMethods();
        System.out.println("--------------------");
        getOneMethod();
    }

    private static void getOneMethod() throws Exception {
//        需求：调用public void doWork()方法；
        Class<User> clz = User.class;
        User user = clz.newInstance();
        Method m = clz.getMethod("doWork");
//        使用Method类的invoke方法，设置被调用方法底层对象，并根据参数列表传值，无参数方法省略。
        Object ret = m.invoke(user);//因为invoke方法的返回类型为Object,此处doWork()方法的返回为void，可以省略返回；

        System.out.println(ret);//null 表示该方法没有返回类型。

//        需求：调用public static void doWork(String name)方法；
        m = clz.getMethod("doWork",String.class);
        m.invoke(user,"INSOMNIA");
        System.out.println(m);
        m=clz.getMethod("doWork",String.class);
        m.invoke(null,"无关风月");


        m = clz.getDeclaredMethod("sayHello", String.class, int.class);
        System.out.println(m);
//        设置可访问私有的成员
        m.setAccessible(true);
        ret = m.invoke(user,"INVOKE",18);
        System.out.println(ret);
    }

    private static void getAllMethods() {
        Class<User> clz = User.class;
        Method[] m =clz.getDeclaredMethods();
        for (Method method :m) {
            System.out.println(method);
        }
        System.out.println("--------------------");
        m = clz.getDeclaredMethods();
        for (Method method :m) {
            System.out.println(method);
        }
    }
}
class User{
    public void doWork(){
        System.out.println("doWork()被调用了。。。");
    }

    public static void doWork(String name){
        System.out.println("doWork(String name)被调用了"+"name = "+name);
    }

    private String sayHello(String name ,int age){
        return name + "," + age;
    }
}
