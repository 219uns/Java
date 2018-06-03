package com.javaBasic.part6_abstractMethod;
/** ����ͳ�Ʋ�ͬ�����ĺ�ʱʱ��ģ����� */

//������ģ����
class TemplateMethod_DesignPattern{
    //ģ���������
    public long getTotalTime(){
        return 0;
    }
}
//ģ�巽�����ģʽ
public class TemplateMethodDemo {
    public static void main(String[] args){
        //ͳ��String����10000�δ�ʱ��int���10000�ε�ʱ���
        System.out.println(new StringOperator().doWork());
        System.out.println(new StringOperator().doWork());
    }
}
//String������10000��
class StringOperator{
    public long doWork(){
        long begin = System.currentTimeMillis();//��ʼʱ��
        String str = "";
        for(int i = 0 ;i < 10000;i ++){
            str += i ;
        }
        long end = System.currentTimeMillis();
        long time = end - begin ;
        return time;
    }
}
//int�����10000��
class IntOperator{
    public long doWork(){
        long begin = System.currentTimeMillis();//��ʼʱ��
        int sum = 0;
        for(int i = 0 ;i < 10000;i ++){
            sum += 1 ;
        }
        long end = System.currentTimeMillis();
        long time = end - begin ;
        return time;
    }
}