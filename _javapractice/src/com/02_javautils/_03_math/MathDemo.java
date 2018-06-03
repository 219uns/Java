package com.javaUtils._03_math;

//Math类中的常量和静态方法演示
public class MathDemo {
    public static void main(String[] args){

        System.out.println(Math.max(20,78));//比较两个数的大小，返回大的数字；
        /*public static int max(int a, int b) {
            return (a >= b) ? a : b;
        }*/

        double randomNums = Math.random();
        System.out.println(randomNums);//返回一个double类型的[0,1)之间的数字，Java中的区间都是前闭后开；
        System.out.println((int)(randomNums * 100));//强转为[0,100)的整数随机数；
    }
}
