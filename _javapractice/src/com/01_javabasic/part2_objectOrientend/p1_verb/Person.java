package com.javaBasic.part2_objectOrientend.p1_verb;
/**
    private：表示私有的，最低访问权限。只能在本类中访问，或者其他类通过getter/setter方法访问；
    不带修饰符：
    protected: 子类访问权限、子包访问权限；
    public: 全局访问权限；
    -------------------------------------------
    this：表示当前对象，主要存在于两个位置：
        构造器：就表示当前创建的对象；
        方法中；哪一个对象调用this所在的方法，this就表示哪一个对象；
        当一个对象创建之后，JVM会在堆中分配一个引用自身的引用-this；此时this字段的值为当前对象的地址值；
    使用this:
        1.解决成员变量和参数（局部变量）之间的二义性，必须使用this；
        2.同类中实例方法间的互调（此时可以省略this）;
        3.将this作为参数传递给另一个方法；
        4.将this作为方法的返回值（链式方法编程）；    //StringBuilder append(){};
        5.构造器重载的互调，this（[实参]）必须写在构造方法第一行；
        6.static不能与this一起使用；
            当字节码被加载进JVM，static成员就已经存在，而此时对象还没有创建，没有对象就没有this；
 */
public class Person{
    Person(){
        System.out.println("无参构造器");
    }
    Person(String name){
        this(name,0);//表示调用参数为String和int类型的构造器；构造器中只能调用一个重载的构造器；且必须写在第一行；
//        this.name = name ; //代码重复，且可维护性低；
    }
    Person(String name ,int age){
        this.name = name ;
        this.age = age ;
    }
    private String name ;//private只能在本类中访问；
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int age ;
    public void setAge(int age){
        if (age < 0){
            System.out.println("傻了吧，年龄不能为负数！");
            return;
        }
        this.age = age ;
    }
    public int getAge(){
        return age;
    }
    public void savePersonInfo(Person person){
        //TODO
    }
    void showThis(){
        System.out.println("Hello World");
        sayHello(); //此处省略了this，即等同于 this.sayHello();
    }
    void sayHello(){
        System.out.println(this.name+","+this.age);
        }
}
