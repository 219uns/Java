package com.reflection._2_methods;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//使用反射调用可变参数（数组参数）
public class ArrayListArgs {
    public static void main(String[] args) throws Exception {
        Class<Employee> clazz = Employee.class;
//        情况一：数组的元素类型是基本类型
        Method method = clazz.getMethod("doWork1", int[].class);
        System.out.println(method);
//        method.invoke(null,1,2,3,4,5,6);  ERROR
        method.invoke(null,new int[]{1,2,3,4,5});

        //        情况二：数组的元素类型是引用类型
        method = clazz.getMethod("doWork2", String[].class);
        System.out.println(method);
//        method.invoke(null,new String[]{"A","B","C"}); //ERROR


        method.invoke(null,new Object[]{new String[]{"A","B","C"}});
//      对于引用类型会被自动解包，因此我们在传值是就得反向对其装包，使用Object[]封装一层；也适用于基本类型；

//        对于参数列表是泛型的如何调用
        method = clazz.getMethod("toArray", Object[].class);
        System.out.println(method);
    }
}
class Employee{
    public static void doWork1(int... args){//等价于int[] args
        System.out.println("doWork1调用成功"+ Arrays.toString(args));
        //System.out.println("可变参数调用成功"+ args);  --打印的会是args的hashCode值；
    }

    public static void doWork2(String... args){//等价于int[] args
        System.out.println("doWork2调用成功"+ Arrays.toString(args));
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }
}