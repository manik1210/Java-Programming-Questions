package org.javaPrograms;

public class FindLeader {

    public static void main(String[] args) {
        int[] arr={6,17,3,5,2};
        for(int i=0;i<arr.length;i++){
            boolean status=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]) {
                    status = false;
                    break;
                }
            }
            if(status){
                System.out.println(arr[i]);
            }
        }
    }
}
