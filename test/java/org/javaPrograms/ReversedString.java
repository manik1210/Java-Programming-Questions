package org.javaPrograms;

public class ReversedString {
    public static void main(String[] args) {
        String input = "My name is Mani";
        char[] chars = input.toCharArray();

        int start = 0;

        for (int i = 0; i < chars.length; i++) {


            if (chars[i] == ' ') {
               reverseCharArray(chars,start,i-1);
                start = i + 1;


            }
            //System.out.println("i Value :" +i);
            if (i == chars.length - 1) {
                reverseCharArray(chars, start, i);
            }


        }
        System.out.println(new String(chars));
        reverseCharArray(chars,0,chars.length-1);
        System.out.println(new String(chars));

    }

    public static void reverseCharArray(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }
}
