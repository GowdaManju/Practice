package com.practice.Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassInsertDeleteGetRandom {

    private List<Integer> list;

    ClassInsertDeleteGetRandom() {
        list = new ArrayList<>();
    }

    public void insert(int value){
        if(!list.contains(value)){
            list.add(value);
            System.out.println(" is inserted successfully : "+list);
        }
    }

    public void delete(int value){
        if(list.contains(value)){
            list.remove(Integer.valueOf(value));
            System.out.println(" is Deleted successfully : "+list);
        }
    }


    public void random(){
        if(!list.isEmpty()){
            int index=(int) (Math.random() * list.size());
            System.out.println(list.get(index));

        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ClassInsertDeleteGetRandom object=new ClassInsertDeleteGetRandom();
        while(true){
            System.out.println("Choose Option");
            System.out.println("1 for Inserting");
            System.out.println("2 for deleting");
            System.out.println("3 for print randomnumber");
            System.out.println("0 exit");

            int option =scanner.nextInt();

            if(option==1){
                System.out.println("Enetr number to insert : ");
                int input =scanner.nextInt();
                object.insert(input);

            }else if(option==2){
                System.out.println("Enetr number to Delete : ");
                int input =scanner.nextInt();
                object.delete(input);

            }else if(option==3){
                object.random();

            }else if(option==0){
                System.exit(0);
            }else{
                System.out.println("Invalid input Please try Again");
                System.exit(0);
            }


        }


    }


}
