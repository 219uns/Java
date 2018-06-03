package com.javaBasic.part6_abstractMethod;
/**
    抽象方法： 使用abstract修饰且没有方法体的方法；
        特点：
            1.使用abstract修饰，没有方法体，留给子类去实现/覆盖；
            2.抽象方法修饰符不能是private、final、static；（抽象方法需要被继承、必需要被覆盖，final与之矛盾、是对象级别的，static修饰的是类级别的）;
            3.抽象方法必须定义在抽象类和接口中；
    -------------------------------------------------------------------------------------
    使用abstract关键字修饰的类；  必须要有子类才有意义，才能完成自己未尽事业；
        特点：
            1.不能创建实例和new一个抽象类，即使创建出来抽象类对象，调用抽象方法，根本没有方法体；
            2.可以不包含抽象方法，若一旦包含，该类必须作为抽象类；可以包含普通方法（留给子类调用的），抽象类室友构造器的，子类构造器必须先调用父类构造器；
            3.若子类没有实现父类所有的抽象方法，那么子类也必须作为抽象类（抽象派生类）；
            4.构造方法不能都定义成private，否则不能有子类（创建子类对象前先调用父类构造方法）；
            5.抽象类不能用final修饰，因为必须有子类，抽象方法才能得以实现；
            6.是不完整的类，需作为父类，功能才能得以实现；

            ** 抽象类可以不存在抽象方法，如此没有太大意义，但是可以防止外界创建对象，所以我们会发现有些工具类没有抽象方法但是也使用abstract修饰；
    -------------------------------------------------------------------------------------
    抽象类和普通类的区别：
            1.普通类有的成员（字段、方法、构造器）抽象类都有；
            2.抽象类不能创建对象，抽象类中可以包含抽象方法；
 */
public class AbstractMethodDemo {
    public static void main(String[] args){
        System.out.println(new Circle(10).getArea());
        System.out.println(new Rectanglen(3,4).getArea());
        System.out.println(new Triangle(3,4,5).getArea());
    }
}
 abstract class Graph{
     abstract public Double getArea();
}
class Circle extends Graph{
    private Integer r;
    Circle(Integer r){
        this.r = r;
    }
    @Override
    public Double getArea(){
        return 3.14 * r * r ;
    }
}
class Rectanglen extends Graph{
    private Integer weigth ;
    private Integer height ;
        Rectanglen(Integer weigth,Integer height){
            this.height = height ;
            this.weigth = weigth ;
        }
    @Override
    public Double getArea() {
        return weigth.doubleValue() * height.doubleValue();
    }
}
class Triangle extends Graph{
    private Integer a ;
    private Integer b ;
    private Integer c ;
    Triangle(Integer a ,Integer b ,Integer c ){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
    @Override
    public Double getArea(){
        Double p = (a + b +c ) / 2.0;
        return Math.sqrt(p*(p-a) * p*(p-b) * p*(p-c));//海伦公式 ，知道三边求三角形面积；
    }
}