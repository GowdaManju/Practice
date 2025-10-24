package com.practice.Practice.arrays;

public class FindTheMissingNum {

    public static void optimal(){
        int arr[]={1,2,3,4,5,7,8,9,10};
        int n=10;
        int excepted_sum=n*(n+1)/2;
        int current_sum=0;
        for(int i=0;i<arr.length;i++){
            current_sum +=arr[i];
        }
        System.out.println("Missing Number=="+(excepted_sum-current_sum));
    }

    public static void better() {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i != arr[i - 1]) {
                System.out.println("Missing Number==" + i);
                break;
            }
        }
    }

        public static void brutforce(){
            int arr[]={1,2,3,4,5,6,7,9,10};
            int n=10;

            for(int i=1;i<=n;i++){
                int flag=0;
                for(int j=0;j<arr.length;j++){
                    if(i==arr[j]){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("Missing Number==" + i);
                }


            }
    }

    public static void main(String[] args){
    try {
        optimal();
        better();
        brutforce();
    }
       catch(Exception e){
           e.printStackTrace();
        }

    }
}
