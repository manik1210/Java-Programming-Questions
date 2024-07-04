package org.javaPrograms;

public class StringPattern {
    public static void main(String[] args) {
        String s="Mani";
        for(int i=1;i<=s.length();i++){
            String subString= s.substring(0,i);
            System.out.println(subString);

        }
    }
}
