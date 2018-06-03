package com.javaBasic.part2_objectOrientend.p3_Polymorphism;

/**
    第一种情况：doWork()存在于父类中，不存在于子类；
        执行结果：编译通过，执行父类方法；（先去SubClass找，找不到再去父类中找）；
    第二种情况：doWork()存在于子类中，不存在于父类；
        执行结果：编译报错；（编译时期会去编译类型SuperClass中去找是否有doWork()，找不到编译报错）；
    第三种情况：doWork()同时存在于父类和子类中；
        执行结果：编译通过，执行SubClass.doWork();运行时期会执行运行类型SubClass；
    第四种情况：doWork()同时存在于父类和子类中，但是是static修饰的；
        执行结果：编译通过，执行的是SuperClass的doWork();
        原因：静态方法的调用，只需要类调用即；如果使用对象调用，其底层编译器也是用的类名调用；
        注意：此时这种情况，叫做方法的隐藏，而不叫方法的覆盖；
            静态是类级别的，多态时对象级别的；
  */


//多态时方法调用的问题
public class MethodTrsnsferPromblem {
    public static void main(String[] args){
        SuperClass cls = new SubClass();
        cls.doWork();
    }
}
class SuperClass{
    public void doWork(){
        System.out.println("父类的doWork方法");
    }
    /*  第二种情况
    public void doWork(){
        System.out.println("父类的doWork方法");
    }
    */

    /*  第四种情况
     public static void doWork(){ ... }
    */
}
class SubClass extends SuperClass{
    public void doWork(){
        System.out.println("子类的doWork方法");
    }
    /*  第四种情况
     public static void doWork(){ ... }
    */
}