package com.practice.Practice.functionalInterface;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface P{
    Boolean testEven(int i);
}
public class Predicate_ {
    /*
    Predicate is a Functional interface in which it used for filtering/Conditional Checks
    Boolean test(T t);
    it will return boolean value
       Example
       filter
     */


    public static void main(String args[]){
        int num=2;
        P p=(i)->{return i%2==0;};
        System.out.println(p.testEven(num));

        Integer arr[]={1,2,3,4,5};

        List<Integer> list= Arrays.asList(arr).stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list);


        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");

        map.entrySet().stream().forEach(i->System.out.println(i));
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(i->System.out.println(i));

        for(Integer i:map.keySet()){
            if(i%2==0){
                System.out.println(i +": "+map.get(i));
            }
        }


    }
}
