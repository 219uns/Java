package com.javaBasic.part2_objectOrientend.p2_extends;
/**
    �������ļ̳й�ϵ��
       1.�����������ʱ��ִ��˳��
            �Ƚ������๹������Ȼ���ڹ������л���ø��๹����������������󣩣���ִ�����๹�������룻

    super�ؼ��֣�
        1.�����๹�����У����ø��౻���ǵķ��������OverrideDemo������ʱ����ʹ��super�ؼ��֣�
        2.�����๹�����У����ø��๹��������ʱ����ʹ��super��䣺 super��������������
 */

public class SubClassInitialDemo {
    public static void main(String[] args){
        Son son = new Son("Java",18,"com.guoyasoft") ;
        System.out.println("name="+son.getName()+"-_-!"+"age="+son.getAge()+"-_-!"+"email="+son.getEmail());
    }
}
class Father{
    private String name;
    private int     age;
    Father(){
        System.out.println("������޲ι�����");
    }
//    ������вι����������ڷ���������Overload��
    Father(String name,int age){
        this.name = name ;
        this.age  = age ;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Son extends Father{
    private String email ;
//    ������вι�������
    Son(String name,int age,String emil){
//        �����ڵ�һ�У����Բ���ʾ����Ĭ�ϵ��ø�����޲����������������Ҫ���ø�����вι������ͱ�����ʾsuper������
//        ����name��age���ڸ����˽���ֶΣ����ܱ��̳У�ֻ���ڸ����з��ʣ����Գ�ʼ��Ҳ�����ڸ����У�
        super(name,age);
        this.email = emil ;
        System.out.println("������޲ι�����");
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}