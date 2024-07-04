package org.javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={40,40,50,10,20,5,5,};
        //Using Set to remove the Duplicates
        //System.out.println(setDuplicatesremoval(arr));

        //using without inBuild Function
        //System.out.println(Arrays.toString(removeDuplicates(arr)));

        //Using most optimized method
        int rd=removeDuplicatesOptimized(arr);
        for(int i=0;i<rd;i++){
            System.out.print(arr[i]+" ");
        }




    }
    public static int[] removeDuplicates(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=arr[i];
        }
        return result;
    }

    public static Set setDuplicatesremoval(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        return set;
    }

    public static int removeDuplicatesOptimized(int[] arr){
        int rd = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd+1;
    }
}
