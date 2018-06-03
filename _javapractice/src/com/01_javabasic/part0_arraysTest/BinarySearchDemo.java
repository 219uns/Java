package com.javaBasic.part0_arraysTest;

//����������
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = binarySearch(arr, 8);
        System.out.print(index);
    }

    public static int binarySearch(int[] arr, int i) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;//�м�����
            int midEle = arr[mid];  //�²��ֵ
            if (midEle > i) {     //�´���
                high = mid - 1;
            } else if (midEle < i) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
            return -1 ;

        }
    }
