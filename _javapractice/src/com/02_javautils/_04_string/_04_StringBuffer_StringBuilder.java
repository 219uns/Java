package com.javaUtils._04_string;
/**
    String��StringBuffer��StringBuilderƴ���ַ������ܱȽ�
        String������ͣ���ΪString�ǲ��ɱ�ģ�ÿ�����ݸı䶼�����ڴ��д����µĶ���

    StringBuffer��StringBuilder������
            ����ʾ�ɱ���ַ��������ܺͷ�������ͬ��
        ��ͬ�㣺������ʹ��StringBuilder,����ʹ������������֤�䰲ȫ��
            StringBuffer��StringBuffer�еķ���ʹ����synchronized���η�����ʾͬ���ģ��ڶ��̲߳�����ʱ����Ա�֤�̵߳İ�ȫ������������ܣ��ٶȣ��ϵͣ�
       StringBuilder��StringBuilder�еķ���û��ʹ��synchronized���η�������ȫ���������ܽϸߣ�
    ---------------------------------------------------------------

        ʹ��StringBuilder�޲ι��������ڵײ㴴����һ������Ϊ16��char[];
            char[] value = new char[16] ;
        ��ʱ������ֻ�ܴ洢16���ַ�����������ˣ����Զ����ݣ��������ȸ�������飬�ٰ�֮ǰ������copy���µ����飩��
            ��ʱ���ܼ��ͣ�һ��ģ���������֪�������Ҫ�洢�����ַ����ڹ������о�Ӧ�����ã�// new StringBuilder(80);
 */
        //�Ƚ�StringBuffer��StringBuilder
public class _04_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//�ȼ���StringBuilder sb = new StringBuilder(16)��
       /*�ײ���룺
        public StringBuilder() {
        super(16);
        }*/
        /*StringBuilder�ĸ��๹������
        AbstractStringBuilder(int capacity) {
            value = new char[capacity];
        }*/
        sb.append("A");
        sb.append("B");
//        �ȼ��ڣ�sb.append("A").append("B");   ��ʽ��̣����ص���this��
        System.out.println(sb);

        String str = new String("ABCDEFG");
        String newStr = new StringBuilder(str).deleteCharAt(str.length() -1).toString();//ɾ���ַ����е�ָ������λ�õ��ַ�
        System.out.println(newStr);//ABCDEF
        System.out.println(new StringBuilder(newStr).reverse());//FEDCBA
    }
}
