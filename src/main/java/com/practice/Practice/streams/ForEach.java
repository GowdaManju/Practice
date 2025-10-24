package com.practice.Practice.streams;
import java.util.*;
public class ForEach {


//ForEach will use consumer functional interface internally which has void accept(T t) method
    public static void main(String ar[]){

        List<String> list=Arrays.asList("A","B","C");
        list.stream().forEach((i)->{System.out.println(i);});

        Map<String,String> map=new HashMap<>();
        map.put("name","A");
        map.put("address","B");
        for(String s:map.keySet()){
            System.out.println(s);
        }

        map.forEach((key,value)->System.out.println(key+" : "+value));


    }
}
