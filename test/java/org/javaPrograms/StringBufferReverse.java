package org.javaPrograms;

public class StringBufferReverse {
    public static void main(String[] args) {
        String input="My Name is Mani";
        StringBuffer str=new StringBuffer(input);
        System.out.println(str.reverse());

        StringBuilder str2=new StringBuilder(input);
        System.out.println(str2.reverse());
    }
}
