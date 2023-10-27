//ADS7: Delete in Linked List  

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.addNode(8);
        list.addNode(20);
        list.addNode(6);
        list.addNode(2);
        list.addNode(19);
        list.addNode(7);
        list.addNode(4);
        list.addNode(15);
        list.addNode(9);
        list.addNode(3);
        list.deleteList();
        
    }
}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class LinkedListClass{
    Node head=null;
    public void addNode(int val){
        Node dummy = new Node(val);
        if(head==null){
            head = dummy;
        }else if(head!=null){
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = dummy;
        }
    }
    
    public void printList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public void deleteList(){
        head=null;
        if(head==null){
            System.out.print("Linked list deleted");
        }
    }
}
