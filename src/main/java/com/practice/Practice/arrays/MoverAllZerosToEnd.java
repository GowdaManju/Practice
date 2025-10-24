package com.practice.Practice.arrays;
import java.util.*;
public class MoverAllZerosToEnd {

    public static void optimal(){
        int arr[] ={1,2,0,4,5,0,8,0};
        int result[]=new int[arr.length];
        int index=-1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                result[index+1]=arr[i];
                index++;
            }
        }
        for(int i=index+1;i<arr.length;i++){
            result[i]=0;
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }


    public static void main(String[] args){
        int arr[] = {7, 0, 9, 0 ,1, 4, 5, 9, 0};
        List<Integer> list=new ArrayList<>();

        //store non-zero elements in list
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }

        //add zeros to the end of the list
        for(int i=list.size();i<arr.length;i++){
            list.add(0);
        }
        arr=list.stream().mapToInt(i->i).toArray();

        // Print the modified array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
