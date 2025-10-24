package com.practice.Practice.arrays;
import java.util.*;
public class TwoSum {

    public static void brutForce(){
        int arr[]={2,6,5,8,11};
        int target=14;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Index of numbers are: "+i+" and "+j);
                }
            }
        }


    }
    public static void optimal(){
        int arr[]={2,6,5,8,11};
        int target=14;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(" "+left +" "+right);
                break;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }

        }
    }
    public static void better(){
       // hashing
        int arr[]={2,6,5,8,11};
        int target=14;

        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int neededValue=target-arr[i];
            if(map.containsKey(neededValue)){
                System.out.println(i+" "+map.get(neededValue));
                break;
            }



        }
    }

    public static void main(String args[]){
        int arr[]={2,6,5,8,11};
        int target=14;


    }
}
