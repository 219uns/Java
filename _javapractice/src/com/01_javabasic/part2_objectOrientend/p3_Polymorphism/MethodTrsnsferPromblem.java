package com.javaBasic.part2_objectOrientend.p3_Polymorphism;

/**
    ��һ�������doWork()�����ڸ����У������������ࣻ
        ִ�н��������ͨ����ִ�и��෽��������ȥSubClass�ң��Ҳ�����ȥ�������ң���
    �ڶ��������doWork()�����������У��������ڸ��ࣻ
        ִ�н�������뱨��������ʱ�ڻ�ȥ��������SuperClass��ȥ���Ƿ���doWork()���Ҳ������뱨����
    �����������doWork()ͬʱ�����ڸ���������У�
        ִ�н��������ͨ����ִ��SubClass.doWork();����ʱ�ڻ�ִ����������SubClass��
    �����������doWork()ͬʱ�����ڸ���������У�������static���εģ�
        ִ�н��������ͨ����ִ�е���SuperClass��doWork();
        ԭ�򣺾�̬�����ĵ��ã�ֻ��Ҫ����ü������ʹ�ö�����ã���ײ������Ҳ���õ��������ã�
        ע�⣺��ʱ����������������������أ������з����ĸ��ǣ�
            ��̬���༶��ģ���̬ʱ���󼶱�ģ�
  */


//��̬ʱ�������õ�����
public class MethodTrsnsferPromblem {
    public static void main(String[] args){
        SuperClass cls = new SubClass();
        cls.doWork();
    }
}
class SuperClass{
    public void doWork(){
        System.out.println("�����doWork����");
    }
    /*  �ڶ������
    public void doWork(){
        System.out.println("�����doWork����");
    }
    */

    /*  ���������
     public static void doWork(){ ... }
    */
}
class SubClass extends SuperClass{
    public void doWork(){
        System.out.println("�����doWork����");
    }
    /*  ���������
     public static void doWork(){ ... }
    */
}