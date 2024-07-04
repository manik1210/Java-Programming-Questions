package org.javaPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String input = "My name is Mani";
        String reversedwords = reverseword(input);
        System.out.println(reversedwords);
    }
        public static String reverseword(String input)
        {
            char[] chars= input.toCharArray();
            int start=0;
            int end=chars.length-1;
            reverseArray(chars,0,chars.length-1);
            for (int i=0;i<chars.length-1;i++){
                if(chars[i]==' '){
                    reverseArray(chars,start,i-1);
                    start=i+1;
                }
            }
            reverseArray(chars,start,end);
            return new String(chars);
        }

        public static void reverseArray(char[] arr, int start, int end){
        while (start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
    }