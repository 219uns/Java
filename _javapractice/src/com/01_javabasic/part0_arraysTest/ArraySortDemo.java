package com.javaBasic.part0_arraysTest;

//������������
public class ArraySortDemo {
    public static void main(String[] srgs){
        int[] arr = new int[]{2,9,6,7,4,1};
        PrintArrDemo.printArr(arr);
        // bubbleSort(arr);//ð������
        // selctionSort1(arr);//�����ܰ�ѡ������
        selectionSort2(arr);
        PrintArrDemo.printArr(arr);
    }

    private static void bubbleSort(int[] arr) {

        for (int j = 0;j < arr.length -1 ; j ++) {
            for(int i = 1;i < arr.length - j ; i ++){
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i,i - 1);
                }
            }
        }
    }
    /**
     * �����ܰ�
     * */
    public static void selctionSort1(int[] arr) {
        for(int j = 1 ;j <= arr.length -1 ; j ++) {
            for (int i = 1; i < arr.length ; i++) {
                if (arr[i -1] > arr[j]) {
                    swap(arr, i -1, j);
                }
            }
        }
    }
    /**
     * ������ѡ������
     * */
    public static void selectionSort2(int[] arr){
        for(int j = 0;j < arr.length -1;j ++){
            int minIndex = j ;
            for(int i = j +1 ;i < arr.length ;i ++){
                if(arr[i] < arr[minIndex]){
                    minIndex = i ;
                }
                swap(arr , j , minIndex);
            }
        }
    }

    //���齻����
    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
