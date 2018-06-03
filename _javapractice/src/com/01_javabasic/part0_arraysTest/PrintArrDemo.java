package com.javaBasic.part0_arraysTest;

//打印数组的方法
public class PrintArrDemo {
    public static void printArr(int[] arrs){
        if(arrs == null){
            System.out.print("null");
            return;
        }
        String ret = "[";
        for(int i=0;i <= arrs.length-1;i++){
            ret=ret + arrs[i];
            if (i != arrs.length - 1){
                ret = ret + ",";
            }
        }
        ret = ret + "]";
        System.out.println(ret);
    }
}
