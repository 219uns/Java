package com.javaBasic.part1_fields_constractor_static;
/**
   Static���η����ص㣺
   1. static���εĳ�Ա���ֶΡ��������ڲ��ࣩ����������ļ��ض����أ��淽���������У�
        ��JVM���ֽ�����ؽ��������ʱ��static���εĳ�Ա���Ѿ��������ڴ����ˣ�

   2. �����ڶ���Ĵ��ڣ�
        �����������ֶ�ͨ�� new �ؼ��ִ��������ģ�

   3. static���εĳ�Ա�������͵����ж��������� //���������࣡
        ͨ�������ʹ��������Ķ��󶼿��Է���static��Ա���������ͳ�ʺ����//��ʵ��仰�Ǵ���ģ�
        ԭ�򣺱�������ͨ������ȥ����static��Ա���䱾����ͨ���������ʣ��Ͷ���û���κι�ϵ��ͨ�������뿴������Ϊ���������ڵײ��Ż���

   4. ֱ��ʹ���������ʣ�
        ��Ϊstatic��Աֱ�������࣬�����ڶ���
 */
class Person{
     String name ;
     int    age ;
     static int totalNums = 5 ;//���������������Ϊ5������ȫ���಻���ڸ��ˣ�������static���Σ�
    Person(String nam,int ag){
        name = name ;
        age = ag ;
        totalNums ++ ;
    }
    void die(){
        totalNums --;
        System.out.println("ȥ���ˡ�����");
    }
    static void extinct(){  // ����ȫ�����״̬���������ڸ��ˣ�������static���Σ�
        totalNums = 0 ;
        System.out.println("��������ˡ�����");
    }
}

public class StaticDemo {
     public static void main(String[] args){
        System.out.println(Person.totalNums);   // 5
        Person person = new Person("Ali",24);
        System.out.println(Person.totalNums);   // 6
        Person p1 = new Person("Lily",25);
        Person p2 = new Person("Javs",26);
        System.out.println(new Person("David",29).totalNums);// 9  ����������ã�����Ϊ��Person.totalNums ;

//         Person.die();  Non-static method 'die()' cannot be referenced from _01_awt_GUI_Demo static context ;���ڶ��󣬾�Ӧ��ʹ�ö�����ʣ�
         p1.die();
         System.out.println(p1.totalNums);

         p2.extinct();  //�䱾��Ϊ�� Person.extinct();
         System.out.println(p2.totalNums);
     }
}
