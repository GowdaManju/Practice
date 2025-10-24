package com.practice.Practice.streams;
import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String ar[]){

        //Print all even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers=numbers.stream().filter(n-> n%2==0).toList();
        System.out.println(numbers);


        //print string starts with A
        List<String> list=Arrays.asList("A","B","C");
        list.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));

    }


}
