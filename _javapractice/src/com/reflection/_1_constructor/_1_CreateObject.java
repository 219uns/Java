package com.reflection._1_constructor;

import java.lang.reflect.Constructor;

//使用反射调用构造器所在类来创建其对象
public class _1_CreateObject {
    public static void main(String[] args) throws Exception{
        Class<Person> clz = Person.class;
        Person p = clz.newInstance();
        Constructor<Person> con = clz.getConstructor();
        Person instance = con.newInstance();//调用无参数构造器

        con = clz.getConstructor(String.class);
        con.newInstance("INSOMNIA");

        con = clz.getDeclaredConstructor(String.class,int.class);
//        con.newInstance("INSOMNIA",18);//报错
//Exception in thread "main" java.lang.IllegalAccessException://非法访问异常
//Class com.reflection._1_constructor._1_CreateObject
//can not access a member of class com.reflection._1_constructor.Person with modifiers "private"
        /** 设置当前构造器可以访问*/
        con.setAccessible(true);//可解决上述问题；使用枚举，即使反射也不行；
        con.newInstance("INSOMNIA",18);
    }
}
class Person{
    public Person(){
        System.out.println("调用无参数构造器");
    }

    public Person(String name){
        System.out.println("调用有参数构造器"+name);
    }

    private Person(String name ,int age){
        System.out.println("调用有参数构造器"+"name = "+name+" & "+"age = "+age);
    }
}