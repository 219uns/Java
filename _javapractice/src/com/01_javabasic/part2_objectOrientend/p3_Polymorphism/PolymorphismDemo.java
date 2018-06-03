package com.javaBasic.part2_objectOrientend.p3_Polymorphism;
/**
    面向对象-多态
    一、什么是多态：
        对象具有多种形态，可以存在不同的形式；
    二、多态的前提：
        可以是继承关系（类和类）；
        也可以是实现关系（接口和实现类），开发中多态通常指这种关系；
    三、多态的特点：
        把子类对象赋给父类变量，在运行时期会表现出具体的子类特征；
    四、多态的作用：（也是接口的作用）
        把不同的子类对象当做是父类来看待，可以屏蔽不同子类对象之间的实现差异，从而写出通用的代码达到通用编程；
    例：
        Animals _01_awt_GUI_Demo =new Dog();
        当代码出现这种情况（编译类型和运行类型不同）时多态就产生了；
    对象(_01_awt_GUI_Demo)的两种类型：
        1.编译类型：申明对象变量的类型，Animal,表示把对象看作是什么类型；
        2.运行类型：对象的真实类型，Dog,运行时才真正确定对象的类型；
 */
/**
    基本数据类型的转换：
        1.自动类型转换：把小类型的数据赋给大类型的变量；此时的大小表示容量范围；
            byte _02_systemclass = 12 ; // byte是1个字节
            int i = _02_systemclass ;   // int是4个字节
        2.强制类型转换：把大类型的数据赋给小类型的变量；
            short s = (short)i; // short是两个字节；
    ------------------------------------------------------------------
    引用类型的转换问题：
        引用类型的大小，指的是父类和子类的关系
        1.自动类型转换：把子类对象赋给父类变量（多态）
            Animal _01_awt_GUI_Demo = new Dog();
              //Object类是所有类的根类；
            Object obj = new Dog();   //注意：如果obj调用Dog类中的方法，就会编译报错，因为Object类中没有该方法；
        2.强制类型转换：把父类类型对象父类子类类型变量（但是该父类类型变量的真实类型是子类类型）
            Animal _01_awt_GUI_Demo = new Dog();
              Dog  d = (Dog)_01_awt_GUI_Demo ;

    instanceof运算符：判断该对象是否是一个类的实例；如果是返回true，否则为false；
               语法： boolean _02_systemclass = 对象A instanceof 类B ；
 */
public class PolymorphismDemo {
    public static void main(String[] args){
        Person person = new Person();
        Animals d = new Dog();
        person.feed(d);
        Animals c = new Cat();
        person.feed(c);
        System.out.println("----------------");
        Object obj = "ABC";//把String对象赋给Object类型（多态）；
        System.out.println(obj instanceof Object);//true
        System.out.println(obj instanceof String);//true
        /**
            在实际开发中，有时候我们只想判断是否为真实类型的实例，而不想判断为编译类型的实例的时候，可以使用：
            getClass():获取对象的真实类型；
         */
        System.out.println(obj.getClass() ==  String.class);//true
        System.out.println(obj.getClass() ==  Object.class);//false
    }
}
class  Animals{
   void eat(){
       //TODO
   }
}
class Dog extends Animals{
    @Override
    void eat() {
        System.out.println("吃肉骨头");
    }
    void watchDoor(){
        System.out.println("看门去了");
    }
}
class Cat extends Animals{
    @Override
    void eat() {
        System.out.println("吃鱼摆摆");
    }
    void cathMouse(){
        System.out.println("捉老鼠了");
    }
}
//饲养员
class Person{
    void feed(Animals animals){
        System.out.println("喂食。。。");
        animals.eat();
        if (animals instanceof Dog){
            Dog dog =(Dog) animals;
            dog.watchDoor();
        }else if (animals instanceof Cat){
            Cat cat = (Cat)animals;
            cat.cathMouse();
        }
    }
}