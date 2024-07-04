package org.javaPrograms;

public class StringExamples {
    public static void main(String[] args) {
        String a= new String("Mani");
        System.out.println(a.hashCode());
        a="Kandan";
        StringBuffer b= new  StringBuffer("Hello");
        System.out.println(a.hashCode());
        System.out.println(b);
    }
}
