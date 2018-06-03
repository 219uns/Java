package com.javaUtils._04_string;

public class _03_StringOperationPractise {
    public static void main(String[] args) {
//        test1();//��ȡ��hello��ͷ���ļ����ĺ�׺��
//        test2();//�ѵ�������ĸ��д
        test3();//�ж��ַ����ǿ�
    }

    private static void test3() {
        System.out.println(" AB CD ".length());//7
        System.out.println(" AB CD ".trim().length());//5 trim()ȥ���ַ���ǰ��Ŀո񣬲������м�Ŀո�
       /*�ж��ַ����ǿգ�1.���ò�Ϊnull  2.��Ϊ���ַ���
            String str1 = null ;
            String str2 = "" ;
            String str3 = " " ;
         */
     /*     ��һ��������
       String str = "  ";
       if(str != null && !"".equals(str.trim())){
           System.out.println("�ǿ�");
       }else {
            System.out.println("��");
        }
        */
     /*     �ڶ���������
        String str = "  ";
       if(str != null && !"".equals(str.trim())){
           return true ��
       }
           return false;
      */
        System.out.println(hasLength(null));//false
        System.out.println(hasLength(""));//false
        System.out.println(hasLength(" "));//false
        System.out.println(hasLength(" A "));//true
    }
    //�ж��ַ�����Ϊ��
    private static boolean hasLength(String str){
        return str != null && !"".equals(str.trim()) ;
    }
    //�ж��ַ���Ϊ��
    private static boolean isBlank(String str){
        return !hasLength(str);
    }

    private static void test1() {
        String fileNames = "abc.java;hello.will.txt;hello.java;hello.class";
//      1.�Էֺ����ָ��ַ�������ȡÿһ���ļ������ƺ���չ��
        String[] names = fileNames.split(";");
        for (String name:names) {
            //�ж�ÿһ���ַ����Ƿ�����hello��ͷ
            if(name.startsWith("hello")){
                System.out.println(name);
                /*
                String[] preName = name.split("\\.");
                System.out.println(preName[1]);
                */
                int index = name.lastIndexOf(".");
                System.out.println(index);
                //��ȡ�ַ���
                String s = name.substring(index);
                System.out.println(s);
            }
        }
    }
    private static void test2() {
        String string = "insomnia";
        //��ȡ��һ���ַ�����װ��Ϊ��д��
        String firstLetter = string.substring(0,1).toUpperCase();
        System.out.println(firstLetter);
        //��ȡ����ĸ֮�������
        String ignoreFirstLetter = string.substring(1);
        System.out.println(firstLetter+ignoreFirstLetter);//Insomnia
    }

}
