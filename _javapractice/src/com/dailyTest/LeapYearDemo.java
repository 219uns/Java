package com.dailyTest;
import java.util.Scanner;

/* ����������ǣ�
�� �ܱ�4�����������ܱ�100������
��
�� �ܱ�100���������ܱ�400������*/
public class LeapYearDemo {
    public static void main(String[] args){ //��ʱջ��ֻ��һ��main���� ��
        Scanner sc = new Scanner(System.in);//�ڶѿռ俪����һ��Scanner����ջ�ռ��scָ��ѿռ�Scanner���ڴ��ַ,���ڻ�ȡ����̨������.
        //ʹ��new�ؼ������ڶ��п���һ���µĿռ䣬�����еĶ���û�б��κα���������ʱ���ȴ�������������GC�����գ��ͷ��ڴ�ռ䣻
        System.out.println("���������Ϊ��");
        if (sc.hasNext()){      // ��ʱhasNext���������ջ����
            int year = sc.nextInt();
            // == �ţ����ڻ����������ͱȽϵ���ֵ�����������������ͱȽϵ������ڴ�ռ��е�hashCodeֵ��
            String result = ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) ? "������" : "������";// ��Ԫ���������ͬ�ڣ�
    /** ��ͬ�ڣ�
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("������");
            }else {
                System.out.println("������");
            }
     */
            System.out.println(result);
        }
        sc.close();
    }
}
