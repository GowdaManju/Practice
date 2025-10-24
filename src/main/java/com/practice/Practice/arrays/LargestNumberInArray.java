package com.practice.Practice.arrays;

public class LargestNumberInArray {

    public static void main(String args[]){

        int arr[] = {7,9,1,4,5,9,0};

        // bruteforce approach
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[arr.length-1]);




    //optimal solution
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);

    }



}
