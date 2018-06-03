package com.javaBasic.part9_defineEnum;

/**
    ö�ٵ��ص㣺
        1.ö�ٵ�ֱ�Ӹ���java.lang.Enum,���ǲ�����ʾ�̳�Enum;
        2.ö�پ��൱һ���࣬���Զ��幹�췽������Ա��������ͨ���������󷽷���
        3.Ĭ��˽�еĹ��췽������ʹ��д����Ȩ��Ҳ��private���ٹ��������ײ�û���޲ι���������
        4.ÿһ��ʵ���ֱ���һ��ȫ�ֳ�����ʾ��ö����Ķ����ǹ̶��ģ�ʵ���������ޣ�����ʹ��new�ؼ��֣�
        5.ö��ʵ������λ��ö�����е��ʼ���֣�ö��ʵ���б��Ҫ�зֺ���������Ա��ָ���
        6.ö��ʵ�����л�����ʱ����ʵ����ö�ٵ������ڲ�����󣨲鿴������class�ļ�����
 */
/**
    ö�ٵ�ʹ�ã�
        1.ö���еĶ���ȫ�ֹ����ľ�̬����������ֱ��ʹ��ö���������ã�
            Weekday day = Weekday.SATURDAY ;
        2.��Ϊjava.lang.Enum��������ö�ٵĸ��࣬�������е�ö�ٶ��󶼿��Ե���Enum���з�����
            String name = ö�ٶ���.name() ;//����ö�ٶ���ĳ�����
            int ordinal = ö�ٶ���.ordinal() ;//����ö�ٶ������ţ���0��ʼ
            String str = ö�ٶ���.toString() ;//����ö�ٶ���ĳ�����
        3.���������ɵ�ö����ľ�̬������
            ö������[] values������
            Weekday[] ws = Weekday.values();//���ص�ǰö�������е����г�����ʹ��һ�������װ������

            ö������ valueof(String s);
            Weekday day = Weekday.valueOf("SUNDAY");//��һ��ָ�����Ƶ��ַ���ת��Ϊ��ǰö������ͬ���ĳ�����
        4.��Java5��ʼ����ö�٣�switchҲ֧�ֲ���ö�����ͣ�
            switchֻ֧��int���ͣ�byte/short/long���Զ�װ�䣬֧��ö������Ϊ��ײ���Ȼʹ����ö�ٶ����ordinal()������

 */

enum Weekday{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
            //ö�ٵĶ���
public class EnumDefineDemo {
    public static void main(String[] args){



        System.out.println(Weekday.SATURDAY);
        System.out.println(Weekday.SATURDAY.name());
        System.out.println(Weekday.SATURDAY.ordinal());

        Weekday[] ws = Weekday.values();
        for(Weekday w : ws){
            System.out.println(w);
        }

        System.out.println(Weekday.valueOf("SUNDAY"));
    }
}
