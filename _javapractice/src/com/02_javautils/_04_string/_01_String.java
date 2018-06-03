package com.javaUtils._04_string;
/**
    接口：CharSequence
    实现类：String 、StingBuffer 、StringBuilder

    字符串的分类：
        1.不可改变的字符串（String）: 当对象创建完毕后，该对象的内容（字符序列）是不能改变的，一旦内容改变就是一个新的对象；
        2.可变的 的字符串（StingBuffer、StringBuilder）：当对象创建完毕之后，该对象的内容可以改变，当内容发生改变的时候，对象保持不变；

    字符串的本质（其实就是char[]）: char表示一个字符；数组表示同一种类型的多个数据；
        String str = "ABCD";    //定义一个字符串对象,等价于：
        char[] cr = new Char[]{"A","B","C","D"};

    ** String其实就是对char[]的封装；
    ------------------------------------------------------------

    String对象的创建：
        1.直接赋一个字面量： String str1 = "ABCD";
        2.通过构造器创建：  String str2 = new String("ABCD");
        ** 两种方式有何区别？分别在内存中如何分布？（以上代码分别创建了几个对象？）
        答：  常量池：专门存储常量的地方；都指的方法区中；
                1.编译常量池：把字节码加载进JVM的时候，存储的是字节码的相关信息（不研究）；
                2.运行常量池：存储常量数据（研究这个）；
                String str1 = "ABCD"; //最多创建一个String对象，最少不创建；
                                        如果常量池中已经存在"ABCD",那么str1直接引用，此时不创建对象；
                                        否则，先在常量池中（方法区）创建"ABCD"内存空间，再引用；
                String str2 = new String("ABCD");//最多创建两个对象，最少有一个；
                                        new关键字绝对会在堆空间创建内存区域，所以至少会创建一个；
                                        常量池相当于缓存，如果常量池中有"ABCD"，那么在堆空间中的String类，直接引用其内存地址；
                                        否则，先在常量池中创建一个对象，再引用，此时就有两个对象；
    ------------------------------------------------------------
    String对象的空值：
        1.表示引用为空（null）： String str = null ;     没有初始化，没有分配内存空间；
        2.内容为空字符串：      String str = "" ;       已经初始化，分配内存空间，但没有内容；
    ------------------------------------------------------------
    判断字符串非空：
    1.引用不能为空（null）  2.内容不能为空字符串（""）

    ------------------------------------------------------------
    字符串的比较操作：
        1.使用 == ：   只能比较引用的内存地址是否相同；
        2.使用equals（）：在Object类中和"=="相同；建议子类覆盖该方法去比较自己的内容；
                        String类覆盖了equals（）比较的是字符内容；

 ***    1>  单独使用""号创建的字符串都是直接量，在编译期就已经确定存储到常量池中；
 *      2>  使用new String("")创建的对象会存储到堆内存中，是运行期才创建；
 *      3>  使用只包含直接量的字符串连接符，如"AB"+"CD"创建的也是直接量，编译期就能确定，已经存储到常量池中；
 *      4>  使用包含String直接量（无final修饰符）的字符串表达式（如"AB"+temp）创建的对象时运行期才能创建的，存储在堆中；
 *                通过变量，或通过调用方法去连接字符串，都只能在运行时期才能确定变量的值和方法的返回值，不存在编译优化操作

 */

public class _01_String {
    private static String getXx(){
        return "AB";
    }
    public static void main(String[] args) {
/*      String str1 = "ABCD";
        String str2 = new String("ABCD");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
*/
        String str1 = "ABCD" ;
        String str2 = "A"+"B"+"C"+"D" ;
        String str3 = "AB" + "CD" ;
        //str1 == str2 == str3  因为存在编译优化操作，底层都是"ABCD";
        String str4 = new String("ABCD") ;

        String temp = "AB" ;
        String str5 = temp + "CD";
        //因为编译时期只会检查语法是否正确，而不知道变量和方法的具体数据为多少，所以编译时期不能优化；
        String str6 = getXx() + "CD";

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//true
        System.out.println(str1 == str4);//false
        System.out.println(str1 == str5);//false
        System.out.println(str1 == str6);//false

    }
}
