package com.javaUtils._04_string;

public class _03_StringOperationPractise {
    public static void main(String[] args) {
//        test1();//获取以hello开头的文件名的后缀名
//        test2();//把单词首字母大写
        test3();//判断字符串非空
    }

    private static void test3() {
        System.out.println(" AB CD ".length());//7
        System.out.println(" AB CD ".trim().length());//5 trim()去除字符串前后的空格，不包括中间的空格；
       /*判断字符串非空：1.引用不为null  2.不为空字符串
            String str1 = null ;
            String str2 = "" ;
            String str3 = " " ;
         */
     /*     第一次做法：
       String str = "  ";
       if(str != null && !"".equals(str.trim())){
           System.out.println("非空");
       }else {
            System.out.println("空");
        }
        */
     /*     第二次做法：
        String str = "  ";
       if(str != null && !"".equals(str.trim())){
           return true ；
       }
           return false;
      */
        System.out.println(hasLength(null));//false
        System.out.println(hasLength(""));//false
        System.out.println(hasLength(" "));//false
        System.out.println(hasLength(" A "));//true
    }
    //判断字符串不为空
    private static boolean hasLength(String str){
        return str != null && !"".equals(str.trim()) ;
    }
    //判断字符串为空
    private static boolean isBlank(String str){
        return !hasLength(str);
    }

    private static void test1() {
        String fileNames = "abc.java;hello.will.txt;hello.java;hello.class";
//      1.以分号来分割字符串，获取每一个文件的名称和拓展名
        String[] names = fileNames.split(";");
        for (String name:names) {
            //判断每一个字符串是否是以hello开头
            if(name.startsWith("hello")){
                System.out.println(name);
                /*
                String[] preName = name.split("\\.");
                System.out.println(preName[1]);
                */
                int index = name.lastIndexOf(".");
                System.out.println(index);
                //截取字符串
                String s = name.substring(index);
                System.out.println(s);
            }
        }
    }
    private static void test2() {
        String string = "insomnia";
        //获取第一个字符，并装换为大写；
        String firstLetter = string.substring(0,1).toUpperCase();
        System.out.println(firstLetter);
        //获取首字母之后的内容
        String ignoreFirstLetter = string.substring(1);
        System.out.println(firstLetter+ignoreFirstLetter);//Insomnia
    }

}
