package com.javaBasic.part2_objectOrientend.p3_Polymorphism;

/**
    字段不存在多态特征演示
        通过对象调用字段，在编译时期就已经决定了调用哪一块内存空间的数据；
        字段不存在覆盖的概念（方法才有），在多态时，字段不能有多态特征（在运行时期体现子类特征）；

    当父类和子类存在相同的字段的时候，无论修饰符是什么（即使是private），都会在各自的内存空间中存储数据；
 */
public class FiledsNoExistPolymorphismDemo {
    public static void main(String[] args){
        SuperClasss clz = new SubClasss();
//        clz.doWorks();    // Sub.name
        System.out.println(clz.name);//结果： Super.name ???
    }
}
class SuperClasss{
    public String name = "Super.name";
    public void doWorks(){
    System.out.println(name);
    }
}
class SubClasss extends SuperClasss{
    public String name = "Sub.name";
    public void doWorks(){
        System.out.println(name);
    }
}