package com.practice.Practice.arrays;

public class LeftRotationOnePlace {

    public static void main(String args[]){
try {
    int arr[] = {1, 2, 3, 4, 5};
    int temp = arr[0];
    for(int i=1;i<arr.length;i++) {
        arr[i-1]=arr[i];
        System.out.print(arr[i] +" ");
    }
    arr[arr.length-1]=temp;


/*
T.C O(n)
S.C O(n)
 */
}catch(Exception e){
    e.printStackTrace();
}
    }

}
