package com.practice.Practice.arrays;

import java.util.*;

public class RemoveDuplictesInSortedArray {
    public static void main(String[] args){
    int arr[]={1,1,2,2,3,3};

    //brutforce approach
    Set<Integer> set=new LinkedHashSet<>();
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
        }
        System.out.println(set.size());



        //optimal solution
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[index]!=arr[i]){
                arr[index+1]=arr[i];
                index=index+1;
            }
        }
        System.out.println(index+1);





    }




}
