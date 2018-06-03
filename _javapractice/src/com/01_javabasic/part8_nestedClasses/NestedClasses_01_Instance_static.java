package com.javaBasic.part8_nestedClasses;
/**
    ����ÿ���ڲ�����˵��Java��������Ϊ������һ�ݶ�����.class�ļ���
        ��Ա�ڲ��ࣺ  �ⲿ����$�ڲ�����           OuterClass$InnerClass
        �ֲ��ڲ��ࣺ  �ⲿ����$�����ڲ�����
        �����ڲ��ࣺ  �ⲿ����$����
 */
/**
    �ⲿ��ķ������η�Ҫôʹ��public��Ҫôȱʡ��
    �ڲ��࿴�����ⲿ��ĳ�Ա��ͬ�ֶΡ�����һ��������ʹ��public��ȱʡ��protect��private��static���Σ�
   ----------------------------------------------------------------------------
 ** ʵ���ڲ��ࣺ
    ����û��ʹ��static���ε��ڲ��ࣻ˵�������ⲿ��Ķ��󣬲������ⲿ��ı���
    �ص㣺    1.����ʵ���ڲ���ǰ����������ⲿ�����ͨ���ⲿ����󴴽��ڲ�����󣨵������ڲ������ʱһ�������ⲿ����󣩣�
                �磺  new OuterClass().new InnerClass();
             2.ʵ���ڲ���ĳ�Ա�Զ������ⲿ���ʵ�������ã��ڲ������ֱ�ӷ����ⲿ��ĳ�Ա��
                �ڲ����.class�ļ���
             3.�ⲿ���в���ֱ�ӷ����ڲ����еĳ�Ա������ͨ���ڲ����ʵ��ȥ���ʣ�
             4.ʵ���ڲ�������ĳ�Ա������ʹ��static���Σ�ֻ�ܶ���ʵ����Ա��
             5.���ʵ���ڲ�����ⲿ����ͬ�����ֶλ򷽷�abc����ô���ڲ����У�
                this.abc  ��ʾ�ڲ����Ա
                �ⲿ����.this.abc ��ʾ�ⲿ���Ա
 */
/**----------------------------------------------------------------------------

 ** ��̬�ڲ��ࣺ ʹ��static���ε��ڲ���
    �ص㣺    1.��̬�ڲ����ʵ�������Զ������ⲿ����ض�ʵ�������ã��ڴ����ڲ����ʵ��ʱ�����ش����ⲿ���ʵ����
                    OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
             2.��̬�ڲ���ĳ�Ա����ֱ�ӷ����ⲿ��ľ�̬��Ա����������ⲿ���ʵ����Ա������ͨ���ⲿ���ʵ��ȥ���ʣ�

             3.�ھ�̬�ڲ����п��Զ��徲̬��Ա��ʵ����Ա��
             4.�������п���ͨ������������ֱ�ӷ��ʾ�̬���еľ�̬��Ա��
 */

      //�ⲿ��
class OuterClass{
    String name = "OuterClss.name";
    static String name2 = "OuterClss.name2";
    void ooxx(){
        System.out.println(new InnerClass().age);
    }
          //ʵ���ڲ���
    class InnerClass{
        int age = 24 ;
        String name = "InnerClass.name";
        void test(){
            String name = "Local.name";
            System.out.println(name);// Local.name
            System.out.println(this.name);// InnerClass.name
            System.out.println(OuterClass.this.name);// OuterClss.name
        }
    }
                //��̬�ڲ���
    static class StaticInner{
        int sex = 0 ;
        static void test2(){
            System.out.println(new OuterClass().name);
            System.out.println(name2);
        }
    }
}
    //ʵ���ڲ���
public class NestedClasses_01_Instance_static {
    public static void main(String[] args){
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();// new OuterClass().new InnerClass();

        new OuterClass().new InnerClass().test();
        out.ooxx();

        OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
        OuterClass.StaticInner.test2();// OuterClss.name2 ��̬��Աʹ���������ã�
    }
}
