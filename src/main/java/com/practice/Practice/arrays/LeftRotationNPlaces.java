package com.practice.Practice.arrays;

public class LeftRotationNPlaces {


    public static void brutForce(){
        //left rotate array
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n=3;
        if(n>arr.length){
            n=n%arr.length;
        }

        int temp[]=new int[n];

        //step:1 store first n elements in temp[]
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }

        //step:2 move remaining elements to left
        for(int i=n;i<arr.length;i++){
            arr[i-n]=arr[i];
        }

        //step:3 add temp elements to end
        for(int i=0;i<temp.length;i++){
            arr[arr.length-n+i]=temp[i];
        }


        //print elements
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void practice2(){
            //left rotate by n
            int arr[] = {1, 2, 3, 4, 5, 6, 7};
            int n=3;

            //check the n if n > arr length
            if(n>arr.length){
                n=n%arr.length;
            }

            int temp[]=new int[n];
            //save first n elements to temp array
            for(int i=0;i<n;i++){
                temp[i]=arr[i];
            }

            //move remaining elements to left
            for(int i=n;i<arr.length;i++){
                arr[i-n]=arr[i];
            }

            //add temp elements to end
            for(int i=0;i<temp.length;i++){
                arr[arr.length-n+i]=temp[i];
            }

            //print elements
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=3;
        /*
        important if N>arr.length; N=N%arr.length;
         */

        /*
        Optimal way
        step 1: first n elements reverse
        step 2 : remaining elements reverse
        step 3:   reverse final array
        example:- {1,2,3,4,5,6,7}
        step 1:-   {3,2,1,4,5,6,7}
        step 2:-   {3,2,1,7,6,5,4}
        step 3:-   {4,5,6,7,1,2,3}
         */
        reverse(arr,0,n-1);
        reverse(arr,n,arr.length-1);
        reverse(arr,0,arr.length-1);

//       for(int i=0;i<arr.length;i++){ //for printing
//           System.out.print(arr[i]+" ");
//       }
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
