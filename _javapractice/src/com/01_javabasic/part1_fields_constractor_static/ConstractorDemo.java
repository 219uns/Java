package com.javaBasic.part1_fields_constractor_static;

class ConstractorDemo {
    String name;    // String name = null ;
    ConstractorDemo(){
        System.out.println("无参数构造器");
    }

    //重载关系。@Overload
    ConstractorDemo(String xxx){
        name = xxx ;
        // 初始化操作；
        // 可以给字段设置初始值，也可以调用初始化方法；
    }

    public static void main(String[] args){
        new ConstractorDemo();  //匿名对象，仅能使用一次；调用无参数构造器；

        ConstractorDemo cons = new ConstractorDemo("有参数构造器"); //调用有参构造器；
        System.out.println(cons.name);
    }
}
