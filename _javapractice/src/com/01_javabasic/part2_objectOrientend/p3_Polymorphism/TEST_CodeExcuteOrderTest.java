package com.javaBasic.part2_objectOrientend.p3_Polymorphism;

/**
 ִ�н����
 1                   App��������SubClz�࣬���Ե��Ȱ�SubClz����ֽ�����ؽ�jvm;
 SuperClz������
 2
 4
 3
 Hello world
 */
public class TEST_CodeExcuteOrderTest {
    private static TEST_CodeExcuteOrderTest d = new TEST_CodeExcuteOrderTest();   //static�ֶεĳ�ʼ�������ǣ�private static App d = null ��
    private SubClz t  = new SubClz();   //�˴��ײ���ʵ���ڹ������г�ʼ����private SubClz t  = null ��
    static {                            //static�����������main()ִ�У�
        //d = new App();    ��̬��Աͨ����̬������ʼ�����Ǿ�̬ͨ����������
        System.out.println(3);
    }
    public TEST_CodeExcuteOrderTest(){
        // t = new SubClz() ;   ���з�static�ֶεĳ�ʼ��������ʵ�����ڹ�����������ִ�еģ�
        System.out.println(4);
    }
    public static void main(String[] args){
        System.out.println("Hello world");
    }

}
class SuperClz{
    SuperClz(){
        System.out.println("SuperClz������");
    }
}
class SubClz extends SuperClz{
    static {
        System.out.println(1);
    }
    SubClz(){
        //super.SuperClz();
        System.out.println("2");
    }
}