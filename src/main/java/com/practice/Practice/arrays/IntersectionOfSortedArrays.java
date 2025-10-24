package com.practice.Practice.arrays;
import java.util.*;

public class IntersectionOfSortedArrays {

    public static void main(String[] args){
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        //O/P: 2,3,4,5


        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num); // store arr2 in set for O(1) lookup
        }

        Set<Integer> intersection = new LinkedHashSet<>();
        for (int num : arr1) {
            if (set.contains(num)) {
                intersection.add(num); // avoid duplicates
            }
        }

        // Convert to list or array
        System.out.println(intersection); // [2, 3, 4, 5]





    }
}
