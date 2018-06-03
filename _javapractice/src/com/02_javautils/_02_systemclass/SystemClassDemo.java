package com.javaUtils._02_systemclass;

import java.util.Arrays;

public class SystemClassDemo {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] dest = new int[10];
        System.out.println(Arrays.toString(dest));
        System.arraycopy(arr,3,dest,3,4);
        System.out.println(Arrays.toString(dest));

        long time = System.currentTimeMillis();//�����Ժ���Ϊ��λ�ĵ�ǰʱ��
        System.out.println(time);

//        System.exit(0);�˳�����JVM����һ���0��ʾ�����˳���������ʾ�쳣�˳���
        /*public static void exit(int status) {
            Runtime.getRuntime().exit(status);
        }*/
        new Test();
        new Test();
        new Test();
        System.gc();//  ǿ�����������������������finalize()������
        /*public static void gc() {
            Runtime.getRuntime().gc();//Runtime�����˵���ģʽ��û�й����Ĺ����������Ƿ����ֲ���static���εģ�˵�������������ṩ��һ��static�������ڷ��ص�ǰ�����
        }*/
        System.out.println("ending������������");


    }
}

class Test{
    //��������������ʱ��ִ�и÷�����
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("����������������");
    }
}