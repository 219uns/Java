package com.javaUtils._03_math;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //ʹ��double   ���⣺����ȷ
        System.out.println("0.09 + 0.01 =  "+ (0.09 + 0.01));//0.09999999999999999
        System.out.println("1.0 - 0.33 =  "+(1.0 - 0.33));//0.6699999999999999
        System.out.println("4.015 * 1000 =  "+(4.015 * 1000));//4014.9999999999995
        System.out.println("12.3 / 100 =  "+(12.3 / 100));//0.12300000000000001

        /*ʹ��BigDecimal  ���ڴ����Ǯ�Ⱦ��Ƚϸߵ�����
        BigDecimal���࣬����Ӧ�����㷽����
            �� ��BigDecimal add(BigDecimal other)
            �� ��BigDecimal subtract(BigDecimal other)
            �� ��BigDecimal multiply(BigDecimal other)
            �� ��BigDecimal divide(BigDecimal other)
        */
        BigDecimal num1 = new BigDecimal(0.09);
        BigDecimal num2 = new BigDecimal(0.01);
        System.out.println(num1.add(num2));//0.09999999999999999687749774324174723005853593349456787109375
        //�ٷ����飺ʹ��Sting���͵Ĺ�������double���͵ı�������ȷ��
         num1 = new BigDecimal("0.09");
         num2 = new BigDecimal("0.01");
        System.out.println(num1.add(num2));//0.10

       /*  BigInteger  ���ڴ���������������long������Ӻ����long����װ����ʱʹ�ã�
        *   ���㷽��ͬ�ϣ�
        * */
    }
}
