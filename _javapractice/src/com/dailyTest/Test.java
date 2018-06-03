package com.dailyTest;

public class Test {
    public static void main(String[] args) {
        Class<Integer> a = int.class;
        Class<Integer> b = Integer.TYPE;
        Class<Integer> c = Integer.class;

        System.out.println(a == b );

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
    }
}
