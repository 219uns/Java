package com.javaBasic.part2_objectOrientend.p3_Polymorphism;
/**
    �������-��̬
    һ��ʲô�Ƕ�̬��
        ������ж�����̬�����Դ��ڲ�ͬ����ʽ��
    ������̬��ǰ�᣺
        �����Ǽ̳й�ϵ������ࣩ��
        Ҳ������ʵ�ֹ�ϵ���ӿں�ʵ���ࣩ�������ж�̬ͨ��ָ���ֹ�ϵ��
    ������̬���ص㣺
        ��������󸳸����������������ʱ�ڻ���ֳ����������������
    �ġ���̬�����ã���Ҳ�ǽӿڵ����ã�
        �Ѳ�ͬ������������Ǹ������������������β�ͬ�������֮���ʵ�ֲ��죬�Ӷ�д��ͨ�õĴ���ﵽͨ�ñ�̣�
    ����
        Animals _01_awt_GUI_Demo =new Dog();
        �������������������������ͺ��������Ͳ�ͬ��ʱ��̬�Ͳ����ˣ�
    ����(_01_awt_GUI_Demo)���������ͣ�
        1.�������ͣ�����������������ͣ�Animal,��ʾ�Ѷ�������ʲô���ͣ�
        2.�������ͣ��������ʵ���ͣ�Dog,����ʱ������ȷ����������ͣ�
 */
/**
    �����������͵�ת����
        1.�Զ�����ת������С���͵����ݸ��������͵ı�������ʱ�Ĵ�С��ʾ������Χ��
            byte _02_systemclass = 12 ; // byte��1���ֽ�
            int i = _02_systemclass ;   // int��4���ֽ�
        2.ǿ������ת�����Ѵ����͵����ݸ���С���͵ı�����
            short s = (short)i; // short�������ֽڣ�
    ------------------------------------------------------------------
    �������͵�ת�����⣺
        �������͵Ĵ�С��ָ���Ǹ��������Ĺ�ϵ
        1.�Զ�����ת������������󸳸������������̬��
            Animal _01_awt_GUI_Demo = new Dog();
              //Object����������ĸ��ࣻ
            Object obj = new Dog();   //ע�⣺���obj����Dog���еķ������ͻ���뱨����ΪObject����û�и÷�����
        2.ǿ������ת�����Ѹ������Ͷ������������ͱ��������Ǹø������ͱ�������ʵ�������������ͣ�
            Animal _01_awt_GUI_Demo = new Dog();
              Dog  d = (Dog)_01_awt_GUI_Demo ;

    instanceof��������жϸö����Ƿ���һ�����ʵ��������Ƿ���true������Ϊfalse��
               �﷨�� boolean _02_systemclass = ����A instanceof ��B ��
 */
public class PolymorphismDemo {
    public static void main(String[] args){
        Person person = new Person();
        Animals d = new Dog();
        person.feed(d);
        Animals c = new Cat();
        person.feed(c);
        System.out.println("----------------");
        Object obj = "ABC";//��String���󸳸�Object���ͣ���̬����
        System.out.println(obj instanceof Object);//true
        System.out.println(obj instanceof String);//true
        /**
            ��ʵ�ʿ����У���ʱ������ֻ���ж��Ƿ�Ϊ��ʵ���͵�ʵ�����������ж�Ϊ�������͵�ʵ����ʱ�򣬿���ʹ�ã�
            getClass():��ȡ�������ʵ���ͣ�
         */
        System.out.println(obj.getClass() ==  String.class);//true
        System.out.println(obj.getClass() ==  Object.class);//false
    }
}
class  Animals{
   void eat(){
       //TODO
   }
}
class Dog extends Animals{
    @Override
    void eat() {
        System.out.println("�����ͷ");
    }
    void watchDoor(){
        System.out.println("����ȥ��");
    }
}
class Cat extends Animals{
    @Override
    void eat() {
        System.out.println("����ڰ�");
    }
    void cathMouse(){
        System.out.println("׽������");
    }
}
//����Ա
class Person{
    void feed(Animals animals){
        System.out.println("ιʳ������");
        animals.eat();
        if (animals instanceof Dog){
            Dog dog =(Dog) animals;
            dog.watchDoor();
        }else if (animals instanceof Cat){
            Cat cat = (Cat)animals;
            cat.cathMouse();
        }
    }
}