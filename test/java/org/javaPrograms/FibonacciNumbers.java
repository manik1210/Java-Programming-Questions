package org.javaPrograms;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int count=10;
        for(int i=0;i<count;i++){
            System.out.print(findFibonacci(i)+" ");
        }
    }
    public static int findFibonacci(int n){
        if(n<=1){
            return n;
        }
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}
