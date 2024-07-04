package org.javaPrograms;

public class FactorialProgram {
    public static void main(String[] args) {
        int num = 5;
        float res = 1;
        for (int i = 1; i <= num; i++) {
            res = i * res;
        }
        System.out.println(res);
        System.out.println(fact(num));
    }
    //using Recursion Method
    public static int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
    }

}
