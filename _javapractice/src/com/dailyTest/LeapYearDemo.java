package com.dailyTest;
import java.util.Scanner;

/* 闰年的条件是：
① 能被4整除，但不能被100整除；
或
② 能被100整除，又能被400整除。*/
public class LeapYearDemo {
    public static void main(String[] args){ //此时栈中只有一个main方法 ；
        Scanner sc = new Scanner(System.in);//在堆空间开辟了一个Scanner对象，栈空间的sc指向堆空间Scanner的内存地址,用于获取控制台的输入.
        //使用new关键字是在堆中开辟一块新的空间，当堆中的对象没有被任何变量所引用时，等待垃圾回收器（GC）回收，释放内存空间；
        System.out.println("输入的数据为：");
        if (sc.hasNext()){      // 此时hasNext方法存放在栈顶；
            int year = sc.nextInt();
            // == 号：对于基本数据类型比较的是值；对于引用数据类型比较的是在内存空间中的hashCode值；
            String result = ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) ? "是闰年" : "非闰年";// 三元运算符，等同于：
    /** 等同于：
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("是闰年");
            }else {
                System.out.println("非闰年");
            }
     */
            System.out.println(result);
        }
        sc.close();
    }
}
