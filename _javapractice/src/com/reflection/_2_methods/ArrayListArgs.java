package com.reflection._2_methods;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ʹ�÷�����ÿɱ���������������
public class ArrayListArgs {
    public static void main(String[] args) throws Exception {
        Class<Employee> clazz = Employee.class;
//        ���һ�������Ԫ�������ǻ�������
        Method method = clazz.getMethod("doWork1", int[].class);
        System.out.println(method);
//        method.invoke(null,1,2,3,4,5,6);  ERROR
        method.invoke(null,new int[]{1,2,3,4,5});

        //        ������������Ԫ����������������
        method = clazz.getMethod("doWork2", String[].class);
        System.out.println(method);
//        method.invoke(null,new String[]{"A","B","C"}); //ERROR


        method.invoke(null,new Object[]{new String[]{"A","B","C"}});
//      �����������ͻᱻ�Զ��������������ڴ�ֵ�Ǿ͵÷������װ����ʹ��Object[]��װһ�㣻Ҳ�����ڻ������ͣ�

//        ���ڲ����б��Ƿ��͵���ε���
        method = clazz.getMethod("toArray", Object[].class);
        System.out.println(method);
    }
}
class Employee{
    public static void doWork1(int... args){//�ȼ���int[] args
        System.out.println("doWork1���óɹ�"+ Arrays.toString(args));
        //System.out.println("�ɱ�������óɹ�"+ args);  --��ӡ�Ļ���args��hashCodeֵ��
    }

    public static void doWork2(String... args){//�ȼ���int[] args
        System.out.println("doWork2���óɹ�"+ Arrays.toString(args));
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }
}