package com.practice.Practice.strings;


import java.util.*;
public class RemoveDuplicates {


    public static void main(String args[]){

        //    * "programming" → "progamin"
        String input="programming";
        Set<String> set=new LinkedHashSet<>();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(set.add(input.charAt(i)+"")){
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);




    }
}
