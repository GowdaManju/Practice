package com.practice.Practice.functionalInterface;

import java.util.Arrays;

@FunctionalInterface
interface A{
    void test(int i);
}


public class Consumer_{

    /*
    Consumer is functional interface in which it has
    one abstract method
    void accept(T t)
    it will accept value and returns nothing
    return type is void
   example
   forEach
     */
    public static void main(String a[]){
        int arr[]={1,2,3,4,5};
        Arrays.asList(arr).stream().forEach(i->System.out.println(i));
        int num=10;
        A ax=(i)->{System.out.println(i);};
        ax.test(num);
    }



}
