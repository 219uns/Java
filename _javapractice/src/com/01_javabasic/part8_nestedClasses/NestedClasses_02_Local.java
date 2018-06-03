package com.javaBasic.part8_nestedClasses;
/**
    局部内部类：
        在方法中定义的内部类，其可见范围是当前方法，和局部变量是同一级别；
    1.不能使用public/static/protect/private修饰
    2.局部内部类只能在当前方法中使用；
    3.局部内部类和实例内部类一样，不能有static成员；
    4.局部内部类和实例内部类，可以访问外部类的所有成员；
 ** 5.局部内部类访问的局部变量必须使用final修饰符（在Java8中默认加上final，但是依然是常量，不能改变值）；
        原因：如果当前方法不是main方法，那么当前方法调用完毕之后，当前方法的栈帧被销毁，方法内的局部变量的空间全部销毁，
             然而局部内部类是定义在方法中的，而且在方法中会创建局部内部类对象，而局部内部类回去访问局部变量，当当前方法被销毁的时候，
             对象还在堆内存，依然持有堆局部变量的引用。但是方法被销毁的时候，局部变量已经被销毁。
             此时出现：在堆内存中，一个对象引用着一个不存在的数据（会造成内存泄漏相关的问题）；
        为了避免该问题，我们使用final修饰使其变为常量永驻内存，即使方法销毁，该该局部变量也在内存中（方法区里），对象继续持有；
 */

            //局部内部类
public class NestedClasses_02_Local {
    static String name = "23";
    public static void main(String[] args){
        int age = 18 ;//局部变量
             //局部内部类
        class Inner{
            String info = "INFO";//默认加上final

            void test(){
                System.out.println(info);//可以直接访问外部类的成员变量
                System.out.println(name);
                System.out.println(age);//局部内部类访问局部变量
            }
        }
        new Inner().test();
    }
}
