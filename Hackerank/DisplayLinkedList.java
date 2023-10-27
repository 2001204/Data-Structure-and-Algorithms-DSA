// ADS7: Delete in Linked List

import java.io.*;
import java.util.*;
public class DisplayLinkedList	
 {
	Node head;
    	public static void main(String[] args)
	 {
     	   	LinkedList list = new LinkedList();
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
System.out.print( "Linked List : " );
		list.display();

    	}

	static class Node
	{
    		int val;
   	 	Node next;
   	 	Node(int val)
   		{
   		     this.val=val;
    		    this.next=null;
    		}
	}
	static class LinkedList
	{
    		Node head=null;
    		public void addNode(int val)
		{
    	 	  Node temp = new Node(val);
      		  if(head==null)
			{
           			 head = temp;
       			 }else if(head!=null){
       			    	Node curr = head;
           		 	while(curr.next!=null){
             		   	curr = curr.next;
           	 		}
           		 curr.next = temp;
        		}
   	 }
    
    	public void display()
	{
        	Node curr = head;
       		 while(curr!=null)
		{
         	   System.out.print(curr.val + " -> ");
          	  curr = curr.next;
        	}
        	System.out.print("null");
    	}
    }
}