package com.reflection._1_constructor;

import java.lang.reflect.Constructor;

//ʹ�÷�����ù����������������������
public class _1_CreateObject {
    public static void main(String[] args) throws Exception{
        Class<Person> clz = Person.class;
        Person p = clz.newInstance();
        Constructor<Person> con = clz.getConstructor();
        Person instance = con.newInstance();//�����޲���������

        con = clz.getConstructor(String.class);
        con.newInstance("INSOMNIA");

        con = clz.getDeclaredConstructor(String.class,int.class);
//        con.newInstance("INSOMNIA",18);//����
//Exception in thread "main" java.lang.IllegalAccessException://�Ƿ������쳣
//Class com.reflection._1_constructor._1_CreateObject
//can not access a member of class com.reflection._1_constructor.Person with modifiers "private"
        /** ���õ�ǰ���������Է���*/
        con.setAccessible(true);//�ɽ���������⣻ʹ��ö�٣���ʹ����Ҳ���У�
        con.newInstance("INSOMNIA",18);
    }
}
class Person{
    public Person(){
        System.out.println("�����޲���������");
    }

    public Person(String name){
        System.out.println("�����в���������"+name);
    }

    private Person(String name ,int age){
        System.out.println("�����в���������"+"name = "+name+" & "+"age = "+age);
    }
}