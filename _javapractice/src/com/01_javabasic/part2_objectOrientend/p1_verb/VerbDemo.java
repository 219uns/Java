package com.javaBasic.part2_objectOrientend.p1_verb;

/**
    ���������������-��װ��
        1.�Ѷ����״̬����Ϊ������һ��ͳһ�����壬�����ߴ����һ��������ģ���У��ࣩ��
        2."��Ϣ����"����ȫ��
 */
/**
    �������󲢸����󸳳�ʼֵ�����ַ�ʽ��
        1.����ע�룺��ͨ���޲ι�����������һ��������ͨ�����������Ӧ��setter������
        2.setterע�루����ע�룩��ֱ�ӵ��ô������Ĺ����������������Ķ�������˳�ʼֵ��
 */
public class VerbDemo {
    public static void main(String[] args){
        Person p1 = new Person();   //�������󣬵���Ĭ���޲ι�������
        p1.setName("Lucy");     //��ʱ��Person��setName�����е�this��ʾp1��
        p1.setAge(18);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
//        p1.savePersonInfo();
        p1.showThis();  // ��ʱ��showThis�����е�ȱʡthisΪp1,�÷���������sayHello()����ôsayHello()�е�thisҲΪp1��

        System.out.println("-------------------");

        Person p2 = new Person();
        p2.setName("Bobo");     //��ʱ��Person��setName�����е�this��ʾp2��
        p2.setAge(24);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        System.out.println("-------------------");

        Person p3 = new Person("iNsomnia");
        p3.showThis();
        Person p4 = new Person("iNsomnia",25);
        p4.showThis();
    }
}
