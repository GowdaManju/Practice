package com.practice.Practice.strings;

import java.util.Stack;

public class BalancedBraces {


    public static void main(String args[]){

        String str="{()}";
        if(str.length()%2!=0){
            System.out.println("Not Balanced");
            return;
        }
        Stack<Character> stack=new Stack<>();

        for(Character c:str.toCharArray()){

            if(c=='{' || c=='(' || c=='['){
                stack.push(c);
            }else if(c=='}' || c==')' || c=='}'){

                if(stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return ;
                }
                char top=stack.pop();
                if((c==')' && top!='(')||
                   (c=='}' && top!='{')||
                        (c ==']' && top!='{')){
                    System.out.println("Not Balanced");

                }
                System.out.println(" Balanced");

            }



        }











              }
}
