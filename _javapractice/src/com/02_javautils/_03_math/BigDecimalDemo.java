package com.javaUtils._03_math;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //使用double   问题：不精确
        System.out.println("0.09 + 0.01 =  "+ (0.09 + 0.01));//0.09999999999999999
        System.out.println("1.0 - 0.33 =  "+(1.0 - 0.33));//0.6699999999999999
        System.out.println("4.015 * 1000 =  "+(4.015 * 1000));//4014.9999999999995
        System.out.println("12.3 / 100 =  "+(12.3 / 100));//0.12300000000000001

        /*使用BigDecimal  用于处理金钱等精度较高的数据
        BigDecimal是类，有相应的运算方法：
            加 ：BigDecimal add(BigDecimal other)
            减 ：BigDecimal subtract(BigDecimal other)
            乘 ：BigDecimal multiply(BigDecimal other)
            除 ：BigDecimal divide(BigDecimal other)
        */
        BigDecimal num1 = new BigDecimal(0.09);
        BigDecimal num2 = new BigDecimal(0.01);
        System.out.println(num1.add(num2));//0.09999999999999999687749774324174723005853593349456787109375
        //官方建议：使用Sting类型的构造器；double类型的本身不够精确；
         num1 = new BigDecimal("0.09");
         num2 = new BigDecimal("0.01");
        System.out.println(num1.add(num2));//0.10

       /*  BigInteger  用于大型整数（当两个long类型相加后可能long类型装不下时使用）
        *   运算方法同上；
        * */
    }
}
