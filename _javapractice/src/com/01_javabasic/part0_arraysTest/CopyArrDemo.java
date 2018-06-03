package com.javaBasic.part0_arraysTest;

//���鿽��Ԫ��
public class CopyArrDemo {
    public static void main(String[] args){
        int[] src = new int[]{1,2,3,4,5,6,7,8,9,10};//Դ����
        int[] dest = new int[10];//Ŀ������
        //���󣺽�src�е�3��4��5��6Ԫ�ؿ�����destiny�С�
        PrintArrDemo.printArr(dest);//[0,0,0,0,0,0,0,0,0,0]
        // ��д������copy(src,2,dest,5,4);
        System.arraycopy(src,2,dest,5,4);
        PrintArrDemo.printArr(dest);//[0,0,0,0,0,3,4,5,6,0]

    }
    /** �������ͣ�
     *         src:
     *         srcPos:  ����������һ������λ�ÿ�ʼ����
     *         dest:
     *         destPos: ��Ŀ����������һ������λ�ÿ�ʼ
     *         length:  ����Ԫ�ظ���
     * */

    public static void copy(int[] src,int srcPos,int[] dest,int destPos,int length) {
        for(int index = srcPos; index < srcPos + length;index ++){
            dest[destPos] = src[index];
            destPos ++;
        }
    }
}

/**������ڵ����⣺
 * 1.ֻ�ܿ���int���͵�����
 * 2.���벻����׳���磺src || dest !=null ; args != null ...
 *
 * ����취��ʹ��jdk�Դ�������copy����:
 *
 * public static native void arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
*/


