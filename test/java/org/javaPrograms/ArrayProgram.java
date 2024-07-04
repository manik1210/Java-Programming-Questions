package org.javaPrograms;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 3, 2, 1, 5, 6, 7, 8, 1};
        //int[] var1 = {16, 17, 4, 3, 5, 2};
        //findLeadArray(var1);
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                        alreadyCounted = true;
                        break;
                    }
                }

            if (!alreadyCounted) {
                for (int j = i; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        count++;

                    }
                }

                System.out.println(arr[i] + " Occurrance " + (count) + " Times");
            }

        }
    }

        //System.out.print("Given Array :");
        public static void findLeadArray ( int[] var1){


            for (int i = 0; i < var1.length; i++) {
                //System.out.print(+var1[i]+" ");
                boolean status = true;

                //Logic
                for (int j = i + 1; j < var1.length; j++) {
                    if (var1[i] <= var1[j]) {
                        status = false;
                        break;
                    }
                }
                if (status) {
                    System.out.println(var1[i]);
                }
            }

        }

    }

