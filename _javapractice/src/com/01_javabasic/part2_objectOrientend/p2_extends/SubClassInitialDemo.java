package com.javaBasic.part2_objectOrientend.p2_extends;
/**
    构造器的继承关系：
       1.创建子类对象时的执行顺序：
            先进入子类构造器，然后在构造器中会调用父类构造器（创建父类对象），再执行子类构造器代码；

    super关键字：
        1.在子类构方法中，调用父类被覆盖的方法（详见OverrideDemo），此时必须使用super关键字；
        2.在子类构造器中，调用父类构造器，此时必须使用super语句： super（【参数】）；
 */

public class SubClassInitialDemo {
    public static void main(String[] args){
        Son son = new Son("Java",18,"com.guoyasoft") ;
        System.out.println("name="+son.getName()+"-_-!"+"age="+son.getAge()+"-_-!"+"email="+son.getEmail());
    }
}
class Father{
    private String name;
    private int     age;
    Father(){
        System.out.println("父类的无参构造器");
    }
//    父类的有参构造器，属于方法的重载Overload；
    Father(String name,int age){
        this.name = name ;
        this.age  = age ;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Son extends Father{
    private String email ;
//    子类的有参构造器；
    Son(String name,int age,String emil){
//        必须在第一行；可以不显示，会默认调用父类的无参数构造器；如果需要调用父类的有参构造器就必须显示super（）；
//        由于name和age属于父类的私有字段，不能被继承，只能在父类中访问，所以初始化也必须在父类中；
        super(name,age);
        this.email = emil ;
        System.out.println("子类的无参构造器");
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}