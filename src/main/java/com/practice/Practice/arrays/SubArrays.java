package com.practice.Practice.arrays;

public class SubArrays {

    public static void maxSlidingWindow() {
try {
    int arr[] = {3, 4, -1, 1, 5};
    int k = 3;

   for(int i=0;i<=arr.length-k;i++){

       int max=arr[i];
       for(int j=i;j<j+k;i++){
        max=Math.max(max,arr[j]);
       }
       System.out.println(max);

   }
}catch(Exception e){
    e.printStackTrace();
}

 }

    public static void main(String args[]) {

//        'ARR' =  [3, 4, -1, 1, 5] and 'K' = 3
//        Output =  [4, 4, 5]


        maxSlidingWindow();
    }

}
