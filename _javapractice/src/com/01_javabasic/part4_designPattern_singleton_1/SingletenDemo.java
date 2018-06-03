package com.javaBasic.part4_designPattern_singleton_1;

import com.javaBasic.part0_arraysTest.PrintArrDemo;

/**
    ���ģʽ - �������ģʽ_������ʽ(���������ʽ����)
        �������ģʽ��
            ��ã���򵥵����ģʽ�������ı�д��N��д����
            Ŀ�ģ���֤������Ӧ����ĳһ��������ֻ��һ��ʵ����һ�����ڶ��ڴ���ֻ����һ�����󣩣�������ָ�����ʵ�������ö�ָ��ͬһ���ڴ�ռ䣻

            ���裺
                1.�����ڸ����У��Լ��ȴ�����һ������
                2.˽�л�����Ĺ���������ֹ���ͨ�������������µĶ���
                3.���Ⱪ¶һ�������ľ�̬�ķ��������ڻ�ȡ����Ķ���

    �������һ�����ݹ����ࣨArrayUtil��,ʹ�õ���ģʽ���
 */
public class SingletenDemo {
    public static void main(String[] args){
        int[] arrays = new int[]{4,1,6,5,9,8,0};
        ArrayUtil.getInstance().srot(arrays);
        PrintArrDemo.printArr(arrays);
    }
}
class ArrayUtil{

//    1.�����ڸ����У��Լ��ȴ�����һ������Ҳ����ʹ��static���Σ������޷�ͨ�������ľ�̬������ȡ����
    private static ArrayUtil instance = new ArrayUtil();
//    2.˽�л�����Ĺ���������ֹ���ͨ�������������µĶ���
    private ArrayUtil(){
//    privateֻ���ڵ�ǰ���з��ʣ�
    }
//    3.���Ⱪ¶һ�������ľ�̬�ķ��������ڻ�ȡ����Ķ���
    public static ArrayUtil getInstance(){
        return instance;
    }
    //ð������
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