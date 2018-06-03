package com.javaBasic.part1_fields_constractor_static;
/**
   Static修饰符的特点：
   1. static修饰的成员（字段、方法、内部类）随着所在类的加载而加载；存方法方法区中；
        当JVM把字节码加载进虚拟机的时候，static修饰的成员就已经存在于内存中了；

   2. 优先于对象的存在；
        对象是我们手动通过 new 关键字创建出来的；

   3. static修饰的成员被该类型的所有对象所共享； //本质属于类！
        通过该类型创建出来的对象都可以访问static成员（狗天生就吃屎）；//其实这句话是错误的；
        原因：表面上是通过对象去访问static成员，其本质是通过类名访问，和对象没有任何关系；通过反编译看到，因为编译器会在底层优化；

   4. 直接使用类名访问；
        因为static成员直接属于类，不属于对象；
 */
class Person{
     String name ;
     int    age ;
     static int totalNums = 5 ;//假设人类的总数量为5；属于全人类不属于个人，所以用static修饰；
    Person(String nam,int ag){
        name = name ;
        age = ag ;
        totalNums ++ ;
    }
    void die(){
        totalNums --;
        System.out.println("去世了。。。");
    }
    static void extinct(){  // 属于全人类的状态，而不属于个人，所以用static修饰；
        totalNums = 0 ;
        System.out.println("人类灭绝了。。。");
    }
}

public class StaticDemo {
     public static void main(String[] args){
        System.out.println(Person.totalNums);   // 5
        Person person = new Person("Ali",24);
        System.out.println(Person.totalNums);   // 6
        Person p1 = new Person("Lily",25);
        Person p2 = new Person("Javs",26);
        System.out.println(new Person("David",29).totalNums);// 9  匿名对象调用，本质为：Person.totalNums ;

//         Person.die();  Non-static method 'die()' cannot be referenced from _01_awt_GUI_Demo static context ;属于对象，就应该使用对象访问；
         p1.die();
         System.out.println(p1.totalNums);

         p2.extinct();  //其本质为： Person.extinct();
         System.out.println(p2.totalNums);
     }
}
