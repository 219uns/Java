package com.javaBasic.part2_objectOrientend.p1_verb;
/**
    private����ʾ˽�еģ���ͷ���Ȩ�ޡ�ֻ���ڱ����з��ʣ�����������ͨ��getter/setter�������ʣ�
    �������η���
    protected: �������Ȩ�ޡ��Ӱ�����Ȩ�ޣ�
    public: ȫ�ַ���Ȩ�ޣ�
    -------------------------------------------
    this����ʾ��ǰ������Ҫ����������λ�ã�
        ���������ͱ�ʾ��ǰ�����Ķ���
        �����У���һ���������this���ڵķ�����this�ͱ�ʾ��һ������
        ��һ�����󴴽�֮��JVM���ڶ��з���һ���������������-this����ʱthis�ֶε�ֵΪ��ǰ����ĵ�ֵַ��
    ʹ��this:
        1.�����Ա�����Ͳ������ֲ�������֮��Ķ����ԣ�����ʹ��this��
        2.ͬ����ʵ��������Ļ�������ʱ����ʡ��this��;
        3.��this��Ϊ�������ݸ���һ��������
        4.��this��Ϊ�����ķ���ֵ����ʽ������̣���    //StringBuilder append(){};
        5.���������صĻ�����this��[ʵ��]������д�ڹ��췽����һ�У�
        6.static������thisһ��ʹ�ã�
            ���ֽ��뱻���ؽ�JVM��static��Ա���Ѿ����ڣ�����ʱ����û�д�����û�ж����û��this��
 */
public class Person{
    Person(){
        System.out.println("�޲ι�����");
    }
    Person(String name){
        this(name,0);//��ʾ���ò���ΪString��int���͵Ĺ���������������ֻ�ܵ���һ�����صĹ��������ұ���д�ڵ�һ�У�
//        this.name = name ; //�����ظ����ҿ�ά���Եͣ�
    }
    Person(String name ,int age){
        this.name = name ;
        this.age = age ;
    }
    private String name ;//privateֻ���ڱ����з��ʣ�
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int age ;
    public void setAge(int age){
        if (age < 0){
            System.out.println("ɵ�˰ɣ����䲻��Ϊ������");
            return;
        }
        this.age = age ;
    }
    public int getAge(){
        return age;
    }
    public void savePersonInfo(Person person){
        //TODO
    }
    void showThis(){
        System.out.println("Hello World");
        sayHello(); //�˴�ʡ����this������ͬ�� this.sayHello();
    }
    void sayHello(){
        System.out.println(this.name+","+this.age);
        }
}
