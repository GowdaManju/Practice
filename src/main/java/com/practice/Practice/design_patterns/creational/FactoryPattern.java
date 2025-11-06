package com.practice.Practice.design_patterns.creational;


/*
The Factory Pattern is used to create objects without exposing the creation logic
You just call the factory method and get the object you need.
 */

 interface Notification{
    void notifyUser();
}

class EmailNotification implements Notification{
     @Override
     public void notifyUser(){
        System.out.println("Sending Email Notification");
     }
}

class SMSNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending SMS Notification");
    }
}

class NotificationFactory{

     public Notification createNotification(String type){
         if(type.equalsIgnoreCase("EMAIL")){
            return new EmailNotification();
         }else{
             return new SMSNotification();
         }

     }
}

public class FactoryPattern {
    public static void main(String args[]){

        NotificationFactory np=new NotificationFactory();
        Notification en=np.createNotification("email");
        Notification sn=np.createNotification("sms");
        en.notifyUser();
        sn.notifyUser();



    }
}
