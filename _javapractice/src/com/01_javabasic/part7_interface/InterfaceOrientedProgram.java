package com.javaBasic.part7_interface;


interface IUSB{
    void swapData();
}
//USB�汾���
class Mouse implements IUSB{
    public void swapData(){
        System.out.println("������ƶ�");
    }
}
//USB�汾��ӡ��
class Printer implements IUSB{
    public void swapData(){
        System.out.println("��ӡ����ཡ�����");
    }
}
//���壬ҲӦ����ѭ
class MotherBoard{
    private static IUSB[] iusbs = new IUSB[6];//��������������
    private static int index = 0 ;//��ʾ�嵽�ڼ���λ�ã�
    //���豸���뵽�����еĹ��ܣ�����USB���Ͷ���
    public static void plugIn(IUSB iusb){
        if(index == iusbs.length){
            System.out.println("�������");
            return;//����������
        }
        iusbs[index] = iusb;
        index ++;

        /** ԭʼ������
        iusb.swapData();
         */
    }
    //ȡ�������е�ÿһ��USB�豸��������
    public static void doWork(){
        for (IUSB i : iusbs){
            if(i != null){
                i.swapData();
            }
        }
    }
}
/**����ӿڱ�̣�
    �ô������Ƕ�̬�ĺô�����ʵ������󸳸��ӿ����ͱ����������˲�ͬʵ����֮���ʵ�ֲ��죬�Ӷ���������ͨ�ñ�̣�
    ������ʹ��USB�豸������;*/
public class InterfaceOrientedProgram {
    public static void main(String[] args){
        //��װ��ӡ��
        MotherBoard.plugIn(new Printer());
        //��װ���
        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
        //�������幤����Ϊ
          MotherBoard.doWork();
          MotherBoard.doWork();
          MotherBoard.doWork();
    }
}
