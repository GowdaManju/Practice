package com.practice.Practice.lambda_exp;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
 interface User{
//     void printName();

//    void printName(String name);

    String printName(String name);
}

public class UserDetails {

    public static void main(String args[]){

//        User user=()-> System.out.println("MG");
//        user.printName();


//        User user=(String name)->System.out.println("Name : "+name);
//        user.printName("MG");

//        User user=(String name)->{ return "Name :"+name;};
//        System.out.println(user.printName("Gowda"));


            //realtime example
//        List<String> names= Arrays.asList("Manju","Roja","Deepa");
//        Collections.sort(names,(name1,name2)->name1.compareTo(name2));
//        System.out.println(names);


    }


}
