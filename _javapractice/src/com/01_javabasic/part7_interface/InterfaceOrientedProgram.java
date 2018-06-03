package com.javaBasic.part7_interface;


interface IUSB{
    void swapData();
}
//USB版本鼠标
class Mouse implements IUSB{
    public void swapData(){
        System.out.println("鼠标在移动");
    }
}
//USB版本打印机
class Printer implements IUSB{
    public void swapData(){
        System.out.println("打印，嘟嘟嘟。。。");
    }
}
//主板，也应当遵循
class MotherBoard{
    private static IUSB[] iusbs = new IUSB[6];//设置主板插孔数量
    private static int index = 0 ;//表示插到第几个位置；
    //把设备插入到主板中的功能，接受USB类型对象
    public static void plugIn(IUSB iusb){
        if(index == iusbs.length){
            System.out.println("插槽已满");
            return;//结束方法；
        }
        iusbs[index] = iusb;
        index ++;

        /** 原始做法：
        iusb.swapData();
         */
    }
    //取出主板中的每一个USB设备，并工作
    public static void doWork(){
        for (IUSB i : iusbs){
            if(i != null){
                i.swapData();
            }
        }
    }
}
/**面向接口编程：
    好处：就是多态的好处：把实现类对象赋给接口类型变量，屏蔽了不同实现类之间的实现差异，从而可以做到通用编程；
    案例：使用USB设备来工作;*/
public class InterfaceOrientedProgram {
    public static void main(String[] args){
        //安装打印机
        MotherBoard.plugIn(new Printer());
        //安装鼠标
        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
//        MotherBoard.plugIn(new Mouse());
        //调用主板工作行为
          MotherBoard.doWork();
          MotherBoard.doWork();
          MotherBoard.doWork();
    }
}
