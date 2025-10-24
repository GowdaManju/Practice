package com.practice.Practice.arrays;

import java.util.*;
public class UnionOfTwoSortedArrays {
    public static void main(String args[]){
    int arr1[]={1,1,2,3,4,5};
    int arr2[]={2,3,4,4,5,6};
    //O/P: 1,2,3,4,5,6


    Set<Integer> set=new LinkedHashSet<>();
    if(arr1.length == arr2.length){
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
            set.add(arr2[i]);
        }
    }else{
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
    }

    int result[]=set.stream().mapToInt(i -> i).toArray();

    //printing
    for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
    }


    }


}
