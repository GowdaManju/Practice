package com.practice.Practice.design_patterns.creational;



//Builder pattern will be used to create complex objects step by step
//It will provide a way to construct a complex object step by step
class User{
    private String name;
    private String email;
    private int age;
    User(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }
    public static class Builder{
        private String name;
        private String email;
        private int age;

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setEmail(String email){
            this.email=email;
            return this;
        }
        public Builder setAge(int age){
            this.age=age;
            return this;
        }
        public User build(){
            return  new User(name,email,age);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}


public class BuilderPattern {


    public static void main(String[] args) {
        User User=new User.Builder().setAge(27).setName("name").build();
        System.out.println(User);



    }
}
