package org.javaPrograms;

public class StringSwap {
    public static void main(String[] args) {
        String a="Mani";
        String b="Vijay";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        //System.out.println(b);
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
