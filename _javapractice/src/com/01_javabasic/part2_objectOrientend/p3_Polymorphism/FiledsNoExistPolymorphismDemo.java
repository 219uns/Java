package com.javaBasic.part2_objectOrientend.p3_Polymorphism;

/**
    �ֶβ����ڶ�̬������ʾ
        ͨ����������ֶΣ��ڱ���ʱ�ھ��Ѿ������˵�����һ���ڴ�ռ�����ݣ�
        �ֶβ����ڸ��ǵĸ���������У����ڶ�̬ʱ���ֶβ����ж�̬������������ʱ������������������

    ����������������ͬ���ֶε�ʱ���������η���ʲô����ʹ��private���������ڸ��Ե��ڴ�ռ��д洢���ݣ�
 */
public class FiledsNoExistPolymorphismDemo {
    public static void main(String[] args){
        SuperClasss clz = new SubClasss();
//        clz.doWorks();    // Sub.name
        System.out.println(clz.name);//����� Super.name ???
    }
}
class SuperClasss{
    public String name = "Super.name";
    public void doWorks(){
    System.out.println(name);
    }
}
class SubClasss extends SuperClasss{
    public String name = "Sub.name";
    public void doWorks(){
        System.out.println(name);
    }
}