package com.practice.Practice.arrays;

import java.util.*;
public class FindNumAvailableOnce {

    public static void brutforce(){
        int arr[]={1,1,0,1,1,5,0,1,1,1,1,1};

        int count=0;

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
                break;
            }
            count=0;

        }
    }


    public static void optimal(){

        int arr[]={1,1,0,1,1,5,0,1,1,1,1,1};
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(Integer i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> result:map.entrySet()){
            if(result.getValue()==1){
                System.out.println(result.getKey()+" Repeated once");
                return;
            }
        }


    }


    public static void main(String args[]){

//        brutforce();
//        optimal();
        int arr[]={1,1,0,1,1,5,0,1,1,1,1,1};
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer set:map.keySet()){
                if(map.get(set)==1){
                    System.out.println(set +": "+map.get(set));
                }

        }


    }
}
