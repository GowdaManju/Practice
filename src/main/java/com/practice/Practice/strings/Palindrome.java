package com.practice.Practice.strings;

public class Palindrome {


    public static void main(String artg[]){

        String input="madam";
        String reverse="";

        for(int i=0;i<input.length();i++){
            reverse=input.charAt(i)+reverse;
        }
        System.out.println(input.equals(reverse));
    }
}
