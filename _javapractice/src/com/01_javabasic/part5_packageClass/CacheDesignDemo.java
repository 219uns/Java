package com.javaBasic.part5_packageClass;


/* 源码：
 public static Integer valueOf(int i) {
 if (i >= IntegerCache.low && i <= IntegerCache.high)
 return IntegerCache.cache[i + (-IntegerCache.low)];
 return new Integer(i);
 }
 */
//包装类的缓存设计  享元模式
public class CacheDesignDemo {
    public static void main(String[] args){

        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println(i1 == i2);//false 比较的是内存地址，每new一个对象就在堆内存中新开辟一块空间

        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf(123);
        System.out.println(i3 == i4);//true   在[-128,127)范围内，就获取缓存中的数据；Byte/Short/Long 也都是这个范围；Character(0,127]
        //自动装箱，底层就是valueOf;
        Integer i5 = 123 ;
        Integer i6 = 123 ;
        System.out.println(i5 == i6);//true

        System.out.println("-----------------------");

        Integer i10 = new Integer(234);
        Integer i20 = new Integer(234);
        System.out.println(i10 == i20);//false

        Integer i30 = Integer.valueOf(234);
        Integer i40 = Integer.valueOf(234);
        System.out.println(i30 == i40);//false  不在缓存设计范围内，就得new Integer（）
        //自动装箱
        Integer i50 = 234 ;
        Integer i60 = 234 ;
        System.out.println(i50 == i60);//false
        System.out.println(i50.equals(i60));//true 包装类型对象之间的比较操作都应该使用该方法比较；比较的是包装的数据；
        /*  源码： 此处在覆写了Object类中的方法；
                public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();  //把包装类类型拆箱为基本类型，再比较值；
        }
        return false;
    }
         */
    }
}
