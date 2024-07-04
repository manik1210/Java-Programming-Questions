package org.javaPrograms;

public class DecimalValues {
    public static void main(String[] args) {
        String s="123.45";
        //Float number=Float.parseFloat(s);
        int decimalIndex=s.indexOf('.');
        String fractionalPart=s.substring(decimalIndex+1);
        System.out.println(Integer.parseInt(fractionalPart));

    }
}
