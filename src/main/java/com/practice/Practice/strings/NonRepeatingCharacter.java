package com.practice.Practice.strings;


import java.util.*;
public class NonRepeatingCharacter {


    public static void brutforce(String input){

        for(int i=0;i<input.length();i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(input.charAt(i));
            }
        }
    }

    public static void optimise(String input){

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<input.length();i++){
            map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);
        }

        for(Character c:map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
            }
        }



    }


    public static void main(String[] arge){

           // * "swiss" → 'w'
            String input="swiss";
            brutforce(input);
            optimise(input);



    }
}
