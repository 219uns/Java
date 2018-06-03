package com.javaBasic.part4_designPattern_singleton_1;

import com.javaBasic.part0_arraysTest.PrintArrDemo;

/**
    设计模式 - 单例设计模式_单讲恶汉式(相较于懒汉式而言)
        单例设计模式：
            最常用，最简单的设计模式，单例的编写有N种写法，
            目的：保证在整个应用中某一个类有且只有一个实例（一个类在堆内存中只存在一个对象），即所以指向该类实例的引用都指向同一块内存空间；

            步骤：
                1.必须在该类中，自己先创建出一个对象；
                2.私有化自身的构造器，防止外界通过构造器创建新的对象；
                3.向外暴露一个公共的静态的方法，用于获取自身的对象；

    需求：设计一个数据工具类（ArrayUtil）,使用单例模式解决
 */
public class SingletenDemo {
    public static void main(String[] args){
        int[] arrays = new int[]{4,1,6,5,9,8,0};
        ArrayUtil.getInstance().srot(arrays);
        PrintArrDemo.printArr(arrays);
    }
}
class ArrayUtil{

//    1.必须在该类中，自己先创建出一个对象（也必须使用static修饰，否则无法通过公共的静态方法获取）；
    private static ArrayUtil instance = new ArrayUtil();
//    2.私有化自身的构造器，防止外界通过构造器创建新的对象；
    private ArrayUtil(){
//    private只能在当前类中访问；
    }
//    3.向外暴露一个公共的静态的方法，用于获取自身的对象；
    public static ArrayUtil getInstance(){
        return instance;
    }
    //冒泡排序
    public void srot(int[] arrays){
        for (int j = 0;j < arrays.length -1 ;j ++){
            for (int i = 1 ;i < arrays.length - j;i ++){
                if(arrays[i] < arrays[i -1]){
                    int temp = arrays[i - 1];
                    arrays[i -1] = arrays[i];
                    arrays[i] = temp ;
                }
            }
        }
    }
}