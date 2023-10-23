//Deletion of node in Doubly linked List

import java.util.*;

class DeletionDoubleLinkList{
	Node head;
	static class Node{
		int data;
		Node next,prev;

		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}

	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head!=null){
			head.prev = new_node;
		}
		head = new_node;
	}

	void append(int new_data){
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;
		if(head==null){
			new_node.prev=null;
			head=new_node;
			return;
		}
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
		new_node.prev=last;


	}

	void display(Node n){
		Node p = null;
		System.out.println("Forward Direction : ");
		while(n!= null){
			System.out.print(n.data+"--> ");
			p=n;
			n=n.next;
		}
		System.out.println("\nBackward Direction : ");
		while(p != null){
			System.out.print("--> "+p.data);
			p=p.prev;
		}
	}

	void insertAfter(Node prev_node, int new_data){
		if(prev_node == null){
			System.out.println("Node cannot be exist.");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		if(new_node.next != null){
			new_node.next.prev = new_node;
		}
	}

	void deleteNode(Node n){
		if(head == null || n == null ){
			return;
		}
		if(head==n){
			head=n.next;
		}
		if(n.next != null){
			n.next.prev = n.prev;
		}
		if(n.prev.next != null){
			n.prev.next=n.next;
		}
		return;

	}

	public static void main(String args[]){
		DeletionDoubleLinkList n1 = new DeletionDoubleLinkList();
		n1.insert(5);
		n1.insert(10);
		n1.insert(15);
		n1.insert(25);
		n1.append(35);
		n1.insertAfter(n1.head.next, 25);
		n1.display(n1.head);
		System.out.println("\n-----------After Deleting Node-------------\n");
		n1.deleteNode(n1.head.next);
		n1.display(n1.head);
	}
}

/*
D:\ADS Workspace\LinkedList>java DeletionDoubleLinkList.java
Forward Direction :
25--> 15--> 25--> 10--> 5--> 35-->
Backward Direction :
--> 35--> 5--> 10--> 25--> 15--> 25
-----------After Deleting Node-------------

Forward Direction :
25--> 25--> 10--> 5--> 35-->
Backward Direction :
--> 35--> 5--> 10--> 25--> 25
*/