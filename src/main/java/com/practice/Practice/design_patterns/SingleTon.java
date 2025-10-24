package com.practice.Practice.design_patterns;

/*
SingleTon design pattern is a creational design pattern in which it will allow us to create only one instance instead of multiple objects
Using:

private constructor
private static variable
static method
 */


class SingleTonObject{
    private static volatile SingleTonObject singleTonObject;
    private SingleTonObject(){

    }
    public static SingleTonObject getInstance(){

        if(singleTonObject ==null){
            synchronized (SingleTonObject.class){
                if(singleTonObject==null){
                    singleTonObject =new SingleTonObject();
                }
            }
        }
        return singleTonObject;
    }

}
public class SingleTon {
public static void main(String arr[]){

    SingleTonObject a=SingleTonObject.getInstance();
    SingleTonObject b=SingleTonObject.getInstance();

    System.out.println(a);
    System.out.println(b);

}

}
