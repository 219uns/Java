package com.reflection._2_methods;

import java.lang.reflect.Method;

//ʹ�÷����ȡ���з���
public class GetMethods {
    public static void main(String[] args) throws Exception {
        getAllMethods();
        System.out.println("--------------------");
        getOneMethod();
    }

    private static void getOneMethod() throws Exception {
//        ���󣺵���public void doWork()������
        Class<User> clz = User.class;
        User user = clz.newInstance();
        Method m = clz.getMethod("doWork");
//        ʹ��Method���invoke���������ñ����÷����ײ���󣬲����ݲ����б�ֵ���޲�������ʡ�ԡ�
        Object ret = m.invoke(user);//��Ϊinvoke�����ķ�������ΪObject,�˴�doWork()�����ķ���Ϊvoid������ʡ�Է��أ�

        System.out.println(ret);//null ��ʾ�÷���û�з������͡�

//        ���󣺵���public static void doWork(String name)������
        m = clz.getMethod("doWork",String.class);
        m.invoke(user,"INSOMNIA");
        System.out.println(m);
        m=clz.getMethod("doWork",String.class);
        m.invoke(null,"�޹ط���");


        m = clz.getDeclaredMethod("sayHello", String.class, int.class);
        System.out.println(m);
//        ���ÿɷ���˽�еĳ�Ա
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
        System.out.println("doWork()�������ˡ�����");
    }

    public static void doWork(String name){
        System.out.println("doWork(String name)��������"+"name = "+name);
    }

    private String sayHello(String name ,int age){
        return name + "," + age;
    }
}
