package com.javaBasic.part7_interface;
/***
    java�еĽӿڣ����������ĳ�����ǽӿڣ���һ���������
        Java�еĽӿڱ�ʾ�淶�����ڶ���һ����󷽷�����ʾĳһ���������߱��Ĺ��ܣ�Ҫ��ʵ�������ʵ�ָýӿڲ��ṩ����ʵ�֣�

    �������﷨:      ��public��class ClassName{}
    ����ӿ��﷨��    ��public��interface InterfaceName{}    �˴�δ���Ǹ��ӿڵ�����
    //  �������ͷ����֣��ࡢ�ӿڡ����飻

    �ӿ��еĳ�Ա��
        1.�ӿ���û�й����������ۣ��ӿڲ��ܴ������󣨲���new����
          �ӿ��в��ܶ�����ͨ���� ��
        2.�ӿ��ж���ĳ�Ա������ʵ����ȫ�־�̬������Ĭ��ʹ�� public static final ���� ��
        3.�ӿ��ж���ķ��������ǹ����ĳ��󷽷���Ĭ��ʹ�� public abstract ���� ��
        4.�ӿ��ж�����ڲ��࣬���ǹ����ľ�̬�ڲ��࣬Ĭ��ʹ��public static ���� ��
    ----------------------------------------------------------------------------

    �ӿڵ��ص�ͼ̳У�
        �ص㣺
            1.û�й��췽����Ҳ������ʾ���幹����������ʵ������
            2.�ӿ�ֻ�ܼ̳нӿڣ����ܼ̳��֧࣬�ֶ�̳У���ֻ�ܵ��̳У�������ӿ�ʹ�ö�������
            3.�ӿ��ж���ĳ�Ա����
            4.�ӿ��ж���ķ���
            5.�ӿ��ж�����ڲ���

    �ӿ���ӿ�ֻ�м̳й�ϵ��ʹ��extends ��
    ����ӿ���ʵ�ֹ�ϵ��ʹ��implements ;
 */
/**
    �ӿڵ�ʵ���ߣ� ʵ����
        �ӿڽ����Ƕ�����ĳһ������Ӧ�þ���ĳЩ���ܣ���û���ṩ�κ�ʵ�֣�
        ��ʱ���ǵ��ṩ�࣬������ȥʵ�ֽӿڣ��Ӷ�ʵ�ֽӿ��ж���Ĺ��ܣ�

    �ӿں�ʵ����֮��Ĺ�ϵ�ϸ��ϳ�֮Ϊ"ʵ�ֹ�ϵ"����implements��ʾ��
    �����ڿ����У���ʱΪ�˷��㣬����Ҳ������ʵ�ֹ�ϵ��֮Ϊ����ļ̳й�ϵ��
        ���Կ���������⣺�ӿ���ʵ����ĸ��ࣻ
            �ӿ� ���� = ����ʵ�������//�����˶�̬˼��

    ע�⣺�ӿ��еķ����ǹ����ĳ���ģ�����ʵ������븲�ǽӿ��еķ���������ʹ��public���Σ�

 */
        //½�ض���
interface IWalkable{
//    String NAME = "�޹ط���oo";     //��������: publiv static final String Name = "�޹ط���oo";

    void walk();    //����������public abstract void walk();

//    class Test1{    }   //����������public static class Test1 {}

//    interface Test2{    }   //
}
        //ˮ������
interface ISwimable{
    void swim();
}
/**            //���ܶ���
interface Amphibiouable extends IWalkable,ISwimable{    }
*/

class Frog implements IWalkable,ISwimable{
    public void walk(){
        System.out.println("������ϰ������");
    }
    public void swim(){
        System.out.println("��Ӿ������");
    }
}
class Cat extends Object implements IWalkable{  //�˴��̳�Objectֻ��Ϊ�˱�ʾռλ��
   public void walk(){  //ע�⣺��Ϊ����ķ���Ȩ�ޱ�����ڵ��ڸ��࣬���ӿ��е�walk����Ĭ��Ϊpublic������ʵ�������ʹ��public����ʵ�ַ�����
        System.out.println("û������è��");
    }
}
public class DefineInterfaceDemo {
    public static void main(String[] args){
//        Cat c = new Cat();    ���޳������ַ�ʽ��̫low��
        IWalkable w=new Cat();//����ӿڱ�̣����ڶ�̬��
        w.walk();//���ֶ�̬������ִ��Cat���е�walk����������

        /**����ӿڱ�̣���Ҫ������һ���ӿڵ�ʵ�ַ�������Ӧ��ʹ����һ�����ӿ�������
        IWalkable frogWalk = new Frog();
        frogWalk.walk();
        ISwimable frogSwim = new Frog();
        frogSwim.swim();
         */
        //��Ҫͬʱʹ���������������������������ɣ�����ʱû�ж�̬��
        Frog frog = new Frog();
        frog.swim();
        frog.walk();
    }
}
