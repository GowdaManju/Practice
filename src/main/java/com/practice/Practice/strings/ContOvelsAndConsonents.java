package com.practice.Practice.strings;

public class ContOvelsAndConsonents {

    public static void main(String args[]){

        String input="ContOvelsAndConsonents";
        input=input.toLowerCase();
        int ovels=0;
        int rest=0;
        for(int i=0;i<input.length();i++){
            char letter=input.charAt(i);
            if(letter=='a' || letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                ovels++;
                continue;
            }
            rest++;

        }
        System.out.println("Ovels count : "+ovels);
        System.out.println("Consonents count : "+rest);



    }




}
