package com.javaUtils._03_math;

//Math���еĳ����;�̬������ʾ
public class MathDemo {
    public static void main(String[] args){

        System.out.println(Math.max(20,78));//�Ƚ��������Ĵ�С�����ش�����֣�
        /*public static int max(int a, int b) {
            return (a >= b) ? a : b;
        }*/

        double randomNums = Math.random();
        System.out.println(randomNums);//����һ��double���͵�[0,1)֮������֣�Java�е����䶼��ǰ�պ󿪣�
        System.out.println((int)(randomNums * 100));//ǿתΪ[0,100)�������������
    }
}
