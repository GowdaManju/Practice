package com.practice.Practice.arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ListNumStartsWith {


    public static void main(String args[]){

        int arr[]={1,5,4,66,7,89,10};
        for(Integer i:arr){

            if(i.toString().startsWith("1")){
                System.out.println(i);
            }
        }

        //using streams
        List<Object> filteredList=Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Object> ab=filteredList.stream().filter(i-> i.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println(ab);







    }


}
