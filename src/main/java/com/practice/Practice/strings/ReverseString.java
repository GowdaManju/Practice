package com.practice.Practice.strings;

import java.util.*;
public class ReverseString {

    public static void brutforce(){
        String input="hello";
        char[] arr=input.toCharArray();
        String result="";
        for(int i=0;i<arr.length;i++){
            result=arr[i]+result;
        }
        System.out.println(result);

        //O(n^2) because everything we append to string it will create new string object


    }

    public static void optimal(){
        String input = "hello";
        for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }


    public static void main(String args[]){

        String input = "hello";
        //Output "olleh";

        brutforce();
        optimal();


    }
}








