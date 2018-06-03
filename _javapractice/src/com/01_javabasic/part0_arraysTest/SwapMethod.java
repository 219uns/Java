package com.javaBasic.part0_arraysTest;

public class SwapMethod {
    public static void main(String[] args){

        int[] arr = new int[]{10,99};
        PrintArrDemo.printArr(arr);
        swap(arr);
        PrintArrDemo.printArr(arr);
    }

    public static void swap(int[] arr) {
        int temp =arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
    }
}
