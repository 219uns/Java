package com.javaBasic.part9_defineEnum;

/**
    枚举的特点：
        1.枚举的直接父类java.lang.Enum,但是不能显示继承Enum;
        2.枚举就相当一个类，可以定义构造方法，成员变量、普通方法、抽象方法；
        3.默认私有的构造方法，即使不写访问权限也是private（假构造器，底层没有无参构造器）；
        4.每一个实例分别用一个全局常量表示，枚举类的对象是固定的，实例个数有限，不能使用new关键字；
        5.枚举实例必须位于枚举体中的最开始部分，枚举实例列表后要有分号与其他成员相分隔；
        6.枚举实例后有花括号时，该实例是枚举的匿名内部类对象（查看编译后的class文件）；
 */
/**
    枚举的使用：
        1.枚举中的都是全局公共的静态常量，可以直接使用枚举类名调用；
            Weekday day = Weekday.SATURDAY ;
        2.因为java.lang.Enum类是所有枚举的父类，所以所有的枚举对象都可以调用Enum类中方法；
            String name = 枚举对象.name() ;//返回枚举对象的常量名
            int ordinal = 枚举对象.ordinal() ;//返回枚举对象的序号，从0开始
            String str = 枚举对象.toString() ;//返回枚举对象的常量名
        3.编译器生成的枚举类的静态方法：
            枚举类型[] values（）；
            Weekday[] ws = Weekday.values();//返回当前枚举类型中的所有常量，使用一个数组封装起来；

            枚举类型 valueof(String s);
            Weekday day = Weekday.valueOf("SUNDAY");//把一个指定名称的字符串转换为当前枚举类中同名的常量；
        4.从Java5开始出现枚举，switch也支持操作枚举类型；
            switch只支持int类型，byte/short/long会自动装箱，支持枚举是因为其底层依然使用了枚举对象的ordinal()方法；

 */

enum Weekday{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
            //枚举的定义
public class EnumDefineDemo {
    public static void main(String[] args){



        System.out.println(Weekday.SATURDAY);
        System.out.println(Weekday.SATURDAY.name());
        System.out.println(Weekday.SATURDAY.ordinal());

        Weekday[] ws = Weekday.values();
        for(Weekday w : ws){
            System.out.println(w);
        }

        System.out.println(Weekday.valueOf("SUNDAY"));
    }
}
