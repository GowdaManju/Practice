package com.practice.Practice.strings;


import java.util.*;
public class Anagram {
public static void brutforce(){
    try {
        String input = "listen";
        String input2 = "silent";

        if (input.length() != input2.length()) {
            return;
        }

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < input2.length(); i++) {
            list.add(input2.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            System.out.println(list.contains(input.charAt(i)));
            if (list.contains(input.charAt(i))) {
                list.remove(Character.valueOf(input.charAt(i)));
            }
        }
        if (list.isEmpty()) {
            System.out.println("ANAGRAM");
        }
    }catch(Exception e){
        e.printStackTrace();
    }
}

public static void better(){
    String input = "aab";
    String input2 = "abb";

    if (input.length() != input2.length()) {
        System.out.println("NOT ANAGRAM");
        return;
    }

    Map<Character,Integer> map1=new HashMap<>();

    for(int i=0;i<input.length();i++){
        map1.put(input.charAt(i),map1.getOrDefault(input.charAt(i),0)+1);
    }

    Map<Character,Integer> map2=new HashMap<>();
    for(int i=0;i<input2.length();i++){
        map2.put(input2.charAt(i),map2.getOrDefault(input2.charAt(i),0)+1);
    }


    for(int i=0;i<input.length();i++){
        if( !map1.get(input.charAt(i)).equals(map2.get(input.charAt(i)))){
            System.out.println("NOT ANAGRAM");
            return;
        }
    }
    System.out.println(" ANAGRAM");

}

public static void optimal(){
    String input = "aab";
    String input2 = "abb";
    if(input.length()!=input2.length()){
        System.out.println("NOT ANAGRAM");
        return;
    }
    char[] array1=input.toCharArray();
    char[] array2=input2.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);


    for(int i=0;i<array1.length;i++){
        if(array1[i]!=array2[i]){
            System.out.println("NOT ANAGRAM");
            return;
        }

    }


    System.out.println(" ANAGRAM");
}


    public static boolean isAnagram(String str1, String str2) {
        //Your code goes here

        if(str1.length()!=str2.length()){
            return false;
        }

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<str2.length();i++){
            char c=str2.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }else{
                return false;
            }
            if(map.get(c)==0){
                map.remove(c);
            }


        }


        return map.isEmpty();
    }


    public static void main(String[] args){
        //    * "listen", "silent" → true
        brutforce();
        better();
        optimal();
        isAnagram("listen","silent");//better




    }
}
