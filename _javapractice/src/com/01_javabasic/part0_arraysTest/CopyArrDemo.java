package com.javaBasic.part0_arraysTest;

//数组拷贝元素
public class CopyArrDemo {
    public static void main(String[] args){
        int[] src = new int[]{1,2,3,4,5,6,7,8,9,10};//源数组
        int[] dest = new int[10];//目标数组
        //需求：将src中的3，4，5，6元素拷贝到destiny中。
        PrintArrDemo.printArr(dest);//[0,0,0,0,0,0,0,0,0,0]
        // 自写方法：copy(src,2,dest,5,4);
        System.arraycopy(src,2,dest,5,4);
        PrintArrDemo.printArr(dest);//[0,0,0,0,0,3,4,5,6,0]

    }
    /** 参数解释：
     *         src:
     *         srcPos:  从数组中哪一个索引位置开始拷贝
     *         dest:
     *         destPos: 在目标数组中哪一个索引位置开始
     *         length:  拷贝元素个数
     * */

    public static void copy(int[] src,int srcPos,int[] dest,int destPos,int length) {
        for(int index = srcPos; index < srcPos + length;index ++){
            dest[destPos] = src[index];
            destPos ++;
        }
    }
}

/**代码存在的问题：
 * 1.只能拷贝int类型的数组
 * 2.代码不够健壮，如：src || dest !=null ; args != null ...
 *
 * 解决办法：使用jdk自带的数组copy方法:
 *
 * public static native void arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
*/


