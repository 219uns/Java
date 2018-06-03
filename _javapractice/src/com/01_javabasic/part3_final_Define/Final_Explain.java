package com.javaBasic.part3_final_Define;
/**
    为什么需要final修饰符：
        继承关系最大的弊端就是破坏封装，子类能访问父类的实现细节，而且可以通过方法覆盖的形式修改实现细节；
        多个修饰符之间是没有先后顺序的： public static final  / final static public ...

    final的含义：表示"最终的，不可改变的"，它可以修饰 非抽象类、非抽象方法、变量 ；
        注意：构造方法不能使用final修饰，因为构造方法不能被继承，肯定是最终的；

    一、final修饰的类：表示最终的类，该类不能再有子类；
        只要满足以下条件就可以把一个类设计成final类：
            1.某类不是专门为继承而设计；
            2.处于安全考虑，类的实现细节不许改动，不准修改源码；
            3.确信该类不会拓展；
        面试题：列举Java中内置的使用final修饰的类？  //Java中使用final修饰的类有很多，比如八大基本数据类型包装类和String类；

    二、final修饰的方法：最终的方法，该方法不能被子类覆盖；
        什么时候的方法需要使用final修饰？
            1.在父类中提供统一的算法，不准子类通过方法覆盖来修改，此时使用final修饰；（模板方法设计模式）
            2.在构造器中调用的方法（初始化方法），此时一般使用final修饰；

        注意：final修饰的方法子类可以调用，但是不能修改；

    三、final修饰的变量：即常量，该变量只能赋值一次，不能再赋值；
          常量分类：
            1.字面值常量（直接给出的数据值/直接量）：如，整数常量1，2，3 ；小数常量3.14 ；boolean常量 true，false等；
            2.定义的final变量；
        -----------------------------------------
        1.final变量必须显示地指的初始值，系统不会为final字段初始化；如下：
        2.final变量一旦赋初始值，就不能重新赋值；
        3.命名规范：常量名符合标识符，单词全部使用大写，多个单词间使用下划线分割；如， final int MAX_VALUE = ... ;

        全局静态常量：public static final 修饰的的变量 ； 直接类名调用即可；

        final修饰基本类型变量：表示该变量值不能变，即不能使用" = "重新赋值 ；
     ** final修饰引用类型变量：表示该变量的引用地址不能被改变，引用地址里的内容可以改变；         String除外。。。

        final是唯一可以修饰局部变量的修饰符；目的何在？--详见局部内部类；局部内部类只能访问final修饰的局部变量；
            局部变量属于方法；
        ------------------------------------------
        什么时候使用常量？
            1.在程序中，多个地方使用共同的数据，且该数据不会改变，此时我们专门定义全局的常量；
            //常量类
            class Constants{ ... }
 */
public class Final_Explain {
    final static String name = "AAA";
    public static void main(String[] args){
        System.out.println(name);

        final Person person = new Person();
        System.out.println(person.info);
        person.info  = "修改值";
        System.out.println(person.info);

//        person = new Person();  无法为最终变量person分配值；
    }
}
class Person{
    public String info = "初始值";
}