package org.javaPrograms;

public class StringExtract {
    public static void main(String[] args) {
        String s="13$53&&";
        StringBuilder specialCharacters =new StringBuilder();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(!isLetterorDigit(c)) {
                specialCharacters.append(c);
            }

        }
        System.out.println(specialCharacters);
    }
    public static boolean isLetterorDigit(char c){
        if(c>='0' && c<='9'){
            return true;
        }
        if(c>='A' && c<='Z'){
            return true;
        }
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
    }
}
