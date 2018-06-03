package com.javaBasic.part2_objectOrientend.p3_Polymorphism;

/**
 执行结果：
 1                   App类依赖于SubClz类，所以得先把SubClz类的字节码加载进jvm;
 SuperClz构造器
 2
 4
 3
 Hello world
 */
public class TEST_CodeExcuteOrderTest {
    private static TEST_CodeExcuteOrderTest d = new TEST_CodeExcuteOrderTest();   //static字段的初始化本质是：private static App d = null ；
    private SubClz t  = new SubClz();   //此处底层其实是在构造器中初始化：private SubClz t  = null ；
    static {                            //static代码块优先于main()执行；
        //d = new App();    静态成员通过静态代码块初始化，非静态通过构造器；
        System.out.println(3);
    }
    public TEST_CodeExcuteOrderTest(){
        // t = new SubClz() ;   所有非static字段的初始化操作其实都是在构造器中优先执行的；
        System.out.println(4);
    }
    public static void main(String[] args){
        System.out.println("Hello world");
    }

}
class SuperClz{
    SuperClz(){
        System.out.println("SuperClz构造器");
    }
}
class SubClz extends SuperClz{
    static {
        System.out.println(1);
    }
    SubClz(){
        //super.SuperClz();
        System.out.println("2");
    }
}