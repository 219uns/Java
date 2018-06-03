package com.javaBasic.part0_arraysTest;

//二分搜索法
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
            int mid = (low + high) >> 1;//中间索引
            int midEle = arr[mid];  //猜测的值
            if (midEle > i) {     //猜大了
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
