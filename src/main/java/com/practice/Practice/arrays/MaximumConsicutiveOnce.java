package com.practice.Practice.arrays;

public class MaximumConsicutiveOnce {



    public static void main(String args[]){
        int arr[]={1,1,0,1,1,1,0,1,1,1,1,1};
        int maxCount=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                if(count>maxCount){
                    maxCount=count;
                }
                count=0;
            }
        }
        if(count>maxCount){
            maxCount=count;
        }


        System.out.println("Max repeated 1's "+maxCount);


    }
}
