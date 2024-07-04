package org.javaPrograms;

public class ArrangingAscending {
    public static void main(String[] args) {
        String input = "My Name is Mani";
        char[] arr = input.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String sortedStr= new String(arr);
        System.out.println(sortedStr);
    }
}
