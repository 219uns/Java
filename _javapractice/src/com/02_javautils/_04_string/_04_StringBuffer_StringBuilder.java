package com.javaUtils._04_string;
/**
    String、StringBuffer、StringBuilder拼接字符串性能比较
        String性能最低：因为String是不可变的，每次内容改变都会在内存中创建新的对象；

    StringBuffer和StringBuilder的区别：
            都表示可变的字符串，功能和方法都相同；
        不同点：（建议使用StringBuilder,可以使用其他方法保证其安全）
            StringBuffer：StringBuffer中的方法使用了synchronized修饰符，表示同步的，在多线程并发的时候可以保证线程的安全，但会造成性能（速度）较低；
       StringBuilder：StringBuilder中的方法没有使用synchronized修饰符，不安全，但是性能较高；
    ---------------------------------------------------------------

        使用StringBuilder无参构造器，在底层创建了一个长度为16的char[];
            char[] value = new char[16] ;
        此时该数组只能存储16个字符，如果超过了，得自动扩容（创建长度更大的数组，再把之前的数组copy到新的数组），
            此时性能极低，一般的，我们事先知道大概需要存储多少字符，在构造器中就应该设置；// new StringBuilder(80);
 */
        //比较StringBuffer和StringBuilder
public class _04_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//等价于StringBuilder sb = new StringBuilder(16)；
       /*底层代码：
        public StringBuilder() {
        super(16);
        }*/
        /*StringBuilder的父类构造器：
        AbstractStringBuilder(int capacity) {
            value = new char[capacity];
        }*/
        sb.append("A");
        sb.append("B");
//        等价于：sb.append("A").append("B");   链式编程：返回的是this；
        System.out.println(sb);

        String str = new String("ABCDEFG");
        String newStr = new StringBuilder(str).deleteCharAt(str.length() -1).toString();//删除字符串中的指定索引位置的字符
        System.out.println(newStr);//ABCDEF
        System.out.println(new StringBuilder(newStr).reverse());//FEDCBA
    }
}
