package com.practice.Practice.linkedlist;



import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Reverselinkedlist {

    public ListNode reverse(ListNode head){

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }



        return prev;
    }




public static void main(String args[]){







}



}
