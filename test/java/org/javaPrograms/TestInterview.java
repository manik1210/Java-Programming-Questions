package org.javaPrograms;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;

public class TestInterview {
    public static void main(String[] args) {
        //Explicit Wait

        String a = "My name is Mani";

        char[] chars = a.toCharArray();
        //System.out.println(chars);

        int start = 0;
        int end = chars.length - 1;
        reverse(chars,start,end);

        System.out.println(new String(chars));
    }


       public static void reverse(char[] arr, int start, int end){
       while(start<end){
           char temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }



    }
}
