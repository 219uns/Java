package com.javaBasic.part1_fields_constractor_static;

class ConstractorDemo {
    String name;    // String name = null ;
    ConstractorDemo(){
        System.out.println("�޲���������");
    }

    //���ع�ϵ��@Overload
    ConstractorDemo(String xxx){
        name = xxx ;
        // ��ʼ��������
        // ���Ը��ֶ����ó�ʼֵ��Ҳ���Ե��ó�ʼ��������
    }

    public static void main(String[] args){
        new ConstractorDemo();  //�������󣬽���ʹ��һ�Σ������޲�����������

        ConstractorDemo cons = new ConstractorDemo("�в���������"); //�����вι�������
        System.out.println(cons.name);
    }
}
