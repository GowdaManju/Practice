package com.practice.Practice.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
class Employe{
    private String name;
    private int salary;
    private int age;

    public Employe(String name,int salary,int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Problems {

    static void sortList(){
        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(0);
        // Collections.sort(list);//ASSENDING ORDER
        //  Collections.reverse(list);//DESSENDING ORDER
        System.out.println(list);



        list.stream().sorted().forEach(i->System.out.println(i));
        System.out.println(list.stream().filter(i->i>5).toList());
        System.out.println(list.stream().filter(i->i>5).findAny().get());
        List<Employe> empList=new ArrayList<>();
        empList.add(new Employe("A",1000,18));
        empList.add(new Employe("D",6000,18));
        empList.add(new Employe("C",2000,18));
        empList.add(new Employe("B",3000,18));

        Collections.sort(empList,(e1,e2)->{return e1.getSalary()-e2.getSalary();});
        System.out.println(empList);










//        list.stream().sorted().forEach(i->System.out.print(i+" "));//ASSENDING ORDER
//        list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
    }



    public static void main(String args[]){

 sortList();
























//        list.stream().sorted().forEach(i->System.out.println(i));
//        list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
//        list.stream().filter(i->i>5).forEach(i->System.out.println(i));

//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//
//                if(list.get(i)<list.get(j)){
//                    int temp=list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j,temp);
//                }
//            }
//        }
//        System.out.println(list);
//        String name="Manjunatha";
//
//        Map<Character,Long> map= name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }
}
