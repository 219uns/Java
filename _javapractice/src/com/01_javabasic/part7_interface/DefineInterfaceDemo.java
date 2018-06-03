package com.javaBasic.part7_interface;
/***
    java中的接口：多个抽象类的抽象就是接口，是一种特殊的类
        Java中的接口表示规范，用于定义一组抽象方法，表示某一类事物必须具备的功能，要求实现类必须实现该接口并提供方法实现；

    定义类语法:      （public）class ClassName{}
    定义接口语法：    （public）interface InterfaceName{}    此处未考虑父接口等类型
    //  引用类型分三种：类、接口、数组；

    接口中的成员：
        1.接口中没有构造器，推论：接口不能创建对象（不能new）；
          接口中不能定义普通方法 ；
        2.接口中定义的成员变量，实质是全局静态常量，默认使用 public static final 修饰 ；
        3.接口中定义的方法，都是公共的抽象方法，默认使用 public abstract 修饰 ；
        4.接口中定义的内部类，都是公共的静态内部类，默认使用public static 修饰 ；
    ----------------------------------------------------------------------------

    接口的特点和继承：
        特点：
            1.没有构造方法，也不能显示定义构造器，不能实例化；
            2.接口只能继承接口，不能继承类，支持多继承（类只能单继承）；多个接口使用逗号连接
            3.接口中定义的成员变量
            4.接口中定义的方法
            5.接口中定义的内部类

    接口与接口只有继承关系，使用extends ；
    类与接口是实现关系，使用implements ;
 */
/**
    接口的实现者： 实现类
        接口仅仅是定义了某一类事物应该具有某些功能，但没有提供任何实现；
        此时我们得提供类，再让类去实现接口，从而实现接口中定义的功能；

    接口和实现类之间的关系严格上称之为"实现关系"，用implements表示；
    但是在开发中，有时为了方便，我们也把这种实现关系称之为特殊的继承关系；
        所以可以这样理解：接口是实现类的父类；
            接口 变量 = 创建实现类对象；//体现了多态思想

    注意：接口中的方法是公共的抽象的，所以实现类必须覆盖接口中的方法，并且使用public修饰；

 */
        //陆地动物
interface IWalkable{
//    String NAME = "无关风月oo";     //反编译结果: publiv static final String Name = "无关风月oo";

    void walk();    //反编译结果：public abstract void walk();

//    class Test1{    }   //反编译结果：public static class Test1 {}

//    interface Test2{    }   //
}
        //水生动物
interface ISwimable{
    void swim();
}
/**            //两栖动物
interface Amphibiouable extends IWalkable,ISwimable{    }
*/

class Frog implements IWalkable,ISwimable{
    public void walk(){
        System.out.println("蛙跳练习。。。");
    }
    public void swim(){
        System.out.println("蛙泳。。。");
    }
}
class Cat extends Object implements IWalkable{  //此处继承Object只是为了表示占位。
   public void walk(){  //注意：因为子类的访问权限必须大于等于父类，父接口中的walk（）默认为public，所以实现类必须使用public修饰实现方法；
        System.out.println("没病走两猫步");
    }
}
public class DefineInterfaceDemo {
    public static void main(String[] args){
//        Cat c = new Cat();    不赞成用这种方式，太low；
        IWalkable w=new Cat();//面向接口编程，存在多态；
        w.walk();//体现多态特征：执行Cat类中的walk（）方法；

        /**面向接口编程：需要调用哪一个接口的实现方法，就应该使用哪一个父接口声明；
        IWalkable frogWalk = new Frog();
        frogWalk.walk();
        ISwimable frogSwim = new Frog();
        frogSwim.swim();
         */
        //需要同时使用两个方法，就用类名声明即可，但此时没有多态；
        Frog frog = new Frog();
        frog.swim();
        frog.walk();
    }
}
