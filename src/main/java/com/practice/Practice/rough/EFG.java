package com.practice.Practice.rough;

// This code is part of a practice exercise and does not implement any specific functionality.

public class EFG {


    public static void main(String args[]) {
        //largest number in Array


        int arr[] = {10, 6, 7, 2, 5, 9, 0};
        // bruteforce approach
        //sorting array

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
        }

System.out.println(max);

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }


    }
}