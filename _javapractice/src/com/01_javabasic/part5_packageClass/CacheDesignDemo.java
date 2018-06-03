package com.javaBasic.part5_packageClass;


/* Դ�룺
 public static Integer valueOf(int i) {
 if (i >= IntegerCache.low && i <= IntegerCache.high)
 return IntegerCache.cache[i + (-IntegerCache.low)];
 return new Integer(i);
 }
 */
//��װ��Ļ������  ��Ԫģʽ
public class CacheDesignDemo {
    public static void main(String[] args){

        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println(i1 == i2);//false �Ƚϵ����ڴ��ַ��ÿnewһ��������ڶ��ڴ����¿���һ��ռ�

        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf(123);
        System.out.println(i3 == i4);//true   ��[-128,127)��Χ�ڣ��ͻ�ȡ�����е����ݣ�Byte/Short/Long Ҳ���������Χ��Character(0,127]
        //�Զ�װ�䣬�ײ����valueOf;
        Integer i5 = 123 ;
        Integer i6 = 123 ;
        System.out.println(i5 == i6);//true

        System.out.println("-----------------------");

        Integer i10 = new Integer(234);
        Integer i20 = new Integer(234);
        System.out.println(i10 == i20);//false

        Integer i30 = Integer.valueOf(234);
        Integer i40 = Integer.valueOf(234);
        System.out.println(i30 == i40);//false  ���ڻ�����Ʒ�Χ�ڣ��͵�new Integer����
        //�Զ�װ��
        Integer i50 = 234 ;
        Integer i60 = 234 ;
        System.out.println(i50 == i60);//false
        System.out.println(i50.equals(i60));//true ��װ���Ͷ���֮��ıȽϲ�����Ӧ��ʹ�ø÷����Ƚϣ��Ƚϵ��ǰ�װ�����ݣ�
        /*  Դ�룺 �˴��ڸ�д��Object���еķ�����
                public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();  //�Ѱ�װ�����Ͳ���Ϊ�������ͣ��ٱȽ�ֵ��
        }
        return false;
    }
         */
    }
}
