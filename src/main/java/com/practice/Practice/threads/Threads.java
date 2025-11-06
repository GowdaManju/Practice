package com.practice.Practice.threads;

class User extends Thread{


    public void run(){
        try {
        System.out.println("USER started");
            Thread.sleep(2111);
            System.out.println("USER ENDED");
        }catch(Exception e){

        }

    }

}

class Man extends Thread{

    public void run(){
        try {
            System.out.println("MAN started");
            Thread.sleep(1111);
            System.out.println("MAN ENDED");

        }catch(Exception e){

        }

    }

}



public class Threads {
    public static void main(String ar[]){
    User user = new User();
    user.start();
    System.out.println("USER Triggered");
    Man man = new Man();
    man.start();
    System.out.println("MAN Triggered");



   System.out.println("Completed");
    }
}
