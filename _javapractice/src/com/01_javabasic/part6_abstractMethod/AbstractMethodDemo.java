package com.javaBasic.part6_abstractMethod;
/**
    ���󷽷��� ʹ��abstract������û�з�����ķ�����
        �ص㣺
            1.ʹ��abstract���Σ�û�з����壬��������ȥʵ��/���ǣ�
            2.���󷽷����η�������private��final��static�������󷽷���Ҫ���̳С�����Ҫ�����ǣ�final��֮ì�ܡ��Ƕ��󼶱�ģ�static���ε����༶��ģ�;
            3.���󷽷����붨���ڳ�����ͽӿ��У�
    -------------------------------------------------------------------------------------
    ʹ��abstract�ؼ������ε��ࣻ  ����Ҫ������������壬��������Լ�δ����ҵ��
        �ص㣺
            1.���ܴ���ʵ����newһ�������࣬��ʹ����������������󣬵��ó��󷽷�������û�з����壻
            2.���Բ��������󷽷�����һ�����������������Ϊ�����ࣻ���԰�����ͨ����������������õģ������������ѹ������ģ����๹���������ȵ��ø��๹������
            3.������û��ʵ�ָ������еĳ��󷽷�����ô����Ҳ������Ϊ�����ࣨ���������ࣩ��
            4.���췽�����ܶ������private�������������ࣨ�����������ǰ�ȵ��ø��๹�췽������
            5.�����಻����final���Σ���Ϊ���������࣬���󷽷����ܵ���ʵ�֣�
            6.�ǲ��������࣬����Ϊ���࣬���ܲ��ܵ���ʵ�֣�

            ** ��������Բ����ڳ��󷽷������û��̫�����壬���ǿ��Է�ֹ��紴�������������ǻᷢ����Щ������û�г��󷽷�����Ҳʹ��abstract���Σ�
    -------------------------------------------------------------------------------------
    ���������ͨ�������
            1.��ͨ���еĳ�Ա���ֶΡ��������������������඼�У�
            2.�����಻�ܴ������󣬳������п��԰������󷽷���
 */
public class AbstractMethodDemo {
    public static void main(String[] args){
        System.out.println(new Circle(10).getArea());
        System.out.println(new Rectanglen(3,4).getArea());
        System.out.println(new Triangle(3,4,5).getArea());
    }
}
 abstract class Graph{
     abstract public Double getArea();
}
class Circle extends Graph{
    private Integer r;
    Circle(Integer r){
        this.r = r;
    }
    @Override
    public Double getArea(){
        return 3.14 * r * r ;
    }
}
class Rectanglen extends Graph{
    private Integer weigth ;
    private Integer height ;
        Rectanglen(Integer weigth,Integer height){
            this.height = height ;
            this.weigth = weigth ;
        }
    @Override
    public Double getArea() {
        return weigth.doubleValue() * height.doubleValue();
    }
}
class Triangle extends Graph{
    private Integer a ;
    private Integer b ;
    private Integer c ;
    Triangle(Integer a ,Integer b ,Integer c ){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
    @Override
    public Double getArea(){
        Double p = (a + b +c ) / 2.0;
        return Math.sqrt(p*(p-a) * p*(p-b) * p*(p-c));//���׹�ʽ ��֪�������������������
    }
}