package com.practice.Practice.design_patterns;

/*
Prototype design pattern is a creational design pattern which used to clone an object
we can achive this using prototype interface with clone method
 */

import com.practice.Practice.functionalInterface.User;

interface Prototype {
    public Object clone();
}
class Student extends ProtoType{
    private int id;
    private String name;
    Student(int id,String name){
    this.id=id;
    this.name=name;
    }
    @Override
    public Object clone(){
    return new Student(id,name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class ProtoType {
    public static void main(String args[]){

        Student student=new Student(1,"manju");
        Student clone=(Student) student.clone();
        System.out.println(student.toString());
        System.out.println(clone.toString());


    }


}
