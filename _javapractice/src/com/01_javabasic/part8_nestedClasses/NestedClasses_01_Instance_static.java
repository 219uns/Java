package com.javaBasic.part8_nestedClasses;
/**
    对于每个内部类来说，Java编译器会为其生成一份独立的.class文件：
        成员内部类：  外部类名$内部类名           OuterClass$InnerClass
        局部内部类：  外部类名$数字内部类名
        匿名内部类：  外部类名$数字
 */
/**
    外部类的访问修饰符要么使用public，要么缺省；
    内部类看作是外部类的成员，同字段、方法一样，可以使用public、缺省、protect、private和static修饰；
   ----------------------------------------------------------------------------
 ** 实例内部类：
    就是没有使用static修饰的内部类；说明属于外部类的对象，不属于外部类的本身；
    特点：    1.创建实例内部类前，必须存在外部类对象，通过外部类对象创建内部类对象（当存在内部类对象时一定存在外部类对象）；
                如：  new OuterClass().new InnerClass();
             2.实例内部类的成员自动持有外部类的实例的引用，内部类可以直接访问外部类的成员；
                内部类的.class文件中
             3.外部类中不能直接访问内部类中的成员，必须通过内部类的实例去访问；
             4.实例内部类中午的成员都不能使用static修饰，只能定义实例成员；
             5.如果实例内部类和外部类存放同名的字段或方法abc，那么在内部类中：
                this.abc  表示内部类成员
                外部类名.this.abc 表示外部类成员
 */
/**----------------------------------------------------------------------------

 ** 静态内部类： 使用static修饰的内部类
    特点：    1.静态内部类的实例不会自动持有外部类的特定实例的引用，在创建内部类的实例时，不必创建外部类的实例；
                    OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
             2.静态内部类的成员可以直接访问外部类的静态成员；如果访问外部类的实例成员，必须通过外部类的实例去访问；

             3.在静态内部类中可以定义静态成员和实例成员；
             4.测试类中可以通过完整的类名直接访问静态类中的静态成员，
 */

      //外部类
class OuterClass{
    String name = "OuterClss.name";
    static String name2 = "OuterClss.name2";
    void ooxx(){
        System.out.println(new InnerClass().age);
    }
          //实例内部类
    class InnerClass{
        int age = 24 ;
        String name = "InnerClass.name";
        void test(){
            String name = "Local.name";
            System.out.println(name);// Local.name
            System.out.println(this.name);// InnerClass.name
            System.out.println(OuterClass.this.name);// OuterClss.name
        }
    }
                //静态内部类
    static class StaticInner{
        int sex = 0 ;
        static void test2(){
            System.out.println(new OuterClass().name);
            System.out.println(name2);
        }
    }
}
    //实例内部类
public class NestedClasses_01_Instance_static {
    public static void main(String[] args){
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();// new OuterClass().new InnerClass();

        new OuterClass().new InnerClass().test();
        out.ooxx();

        OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
        OuterClass.StaticInner.test2();// OuterClss.name2 静态成员使用类名调用；
    }
}
