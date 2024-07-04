package org.javaPrograms;

public class FindingLeader {
    public static void main(String[] args) {
        int[] arr= {16, 17, 4, 3, 5, 2};

        for(int i=0;i<arr.length;i++){
            Boolean isleader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    isleader=false;
                    break;
                }
            }
            if(isleader){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
