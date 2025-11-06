package com.practice.Practice.design_patterns.creational;

/*
Prototype design pattern is a creational design pattern which used to clone an object
we can achive this using prototype interface with clone method
 */

interface Prototype<T>{
    T clone();
}
class Student implements Prototype<Student>{
    private int rool_num;
    private String name;
    Student(int rool_num,String name){
        this.rool_num=rool_num;
        this.name=name;
    }
    @Override
     public Student clone(){
        return new Student(rool_num,name);
    }
    @Override
    public String toString(){

        return "rool_num:"+rool_num+" name:"+name;
    }

}


public class ProtoTypePattern {
    public static void main(String args[]){
        Student student=new Student(1,"Manju");
        System.out.println(student);
        Student clone=student.clone();
        System.out.println(clone);


    }


}
