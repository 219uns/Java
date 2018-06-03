package com.javaUtils._02_systemclass;

import java.util.Arrays;

public class SystemClassDemo {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] dest = new int[10];
        System.out.println(Arrays.toString(dest));
        System.arraycopy(arr,3,dest,3,4);
        System.out.println(Arrays.toString(dest));

        long time = System.currentTimeMillis();//返回以毫秒为单位的当前时间
        System.out.println(time);

//        System.exit(0);退出程序（JVM），一般的0表示正常退出，其他表示异常退出；
        /*public static void exit(int status) {
            Runtime.getRuntime().exit(status);
        }*/
        new Test();
        new Test();
        new Test();
        System.gc();//  强制运行垃圾回收器；会调用finalize()方法；
        /*public static void gc() {
            Runtime.getRuntime().gc();//Runtime体现了单例模式：没有公共的构造器，但是方法又不是static修饰的，说明该类中至少提供了一个static方法用于返回当前类对象；
        }*/
        System.out.println("ending。。。。。。");


    }
}

class Test{
    //运行垃圾回收器时会执行该方法；
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用了垃圾回收器");
    }
}