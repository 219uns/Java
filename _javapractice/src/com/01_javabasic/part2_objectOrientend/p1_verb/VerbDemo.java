package com.javaBasic.part2_objectOrientend.p1_verb;

/**
    面向对象三大特性-封装：
        1.把对象的状态和行为看作是一个统一的整体，将二者存放在一个独立的模块中（类）；
        2."信息隐藏"：安全性
 */
/**
    创建对象并给对象赋初始值的两种方式：
        1.构造注入：先通过无参构造器创建出一个对象，再通过对象调用相应的setter方法；
        2.setter注入（属性注入）：直接调用带参数的构造器，创建出来的对象就有了初始值；
 */
public class VerbDemo {
    public static void main(String[] args){
        Person p1 = new Person();   //创建对象，调用默认无参构造器；
        p1.setName("Lucy");     //此时在Person类setName方法中的this表示p1；
        p1.setAge(18);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
//        p1.savePersonInfo();
        p1.showThis();  // 此时在showThis方法中的缺省this为p1,该方法调用了sayHello()，那么sayHello()中的this也为p1；

        System.out.println("-------------------");

        Person p2 = new Person();
        p2.setName("Bobo");     //此时在Person类setName方法中的this表示p2；
        p2.setAge(24);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        System.out.println("-------------------");

        Person p3 = new Person("iNsomnia");
        p3.showThis();
        Person p4 = new Person("iNsomnia",25);
        p4.showThis();
    }
}
