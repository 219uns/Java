package com.javaBasic.part6_abstractMethod;
/** 需求：统计不同操作的耗时时间模板操作 */

//操作的模板类
class TemplateMethod_DesignPattern{
    //模板操作方法
    public long getTotalTime(){
        return 0;
    }
}
//模板方法设计模式
public class TemplateMethodDemo {
    public static void main(String[] args){
        //统计String链接10000次此时和int相加10000次的时间差
        System.out.println(new StringOperator().doWork());
        System.out.println(new StringOperator().doWork());
    }
}
//String的连接10000次
class StringOperator{
    public long doWork(){
        long begin = System.currentTimeMillis();//开始时间
        String str = "";
        for(int i = 0 ;i < 10000;i ++){
            str += i ;
        }
        long end = System.currentTimeMillis();
        long time = end - begin ;
        return time;
    }
}
//int的相加10000次
class IntOperator{
    public long doWork(){
        long begin = System.currentTimeMillis();//开始时间
        int sum = 0;
        for(int i = 0 ;i < 10000;i ++){
            sum += 1 ;
        }
        long end = System.currentTimeMillis();
        long time = end - begin ;
        return time;
    }
}