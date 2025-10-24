package com.practice.Practice.rough;

public class ABC {

    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++ ){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }

return arr;

    }
public static void reverse(int[] arr,int start,int end){

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
}
    public static void main(String arfs[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=20;
        if(n>arr.length){
            n=n % arr.length;
        }
        reverse(arr,0,n-1);
        reverse(arr,n,arr.length-1);
        reverse(arr,0,arr.length-1);


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
