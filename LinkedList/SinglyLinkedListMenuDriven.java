//package SinglyLinkedList;

import java.util.Scanner;

class SinglyLinkedListMenuDriven{
	public static void main(String agrs[]) {
		int choice, val, pos;
		
		SinglyLinkList list = new SinglyLinkList();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add at Pos\n5. Del First\n6. Del Last\n7. Del At Position\n8. Delete All\nEnter Choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: //Display
				list.display();
				break;
			case 2: //Add First
				System.out.println("Enter new element:");
				val= sc.nextInt();
				list.addFirst(val);
				break;
			case 3: //Add Last
				System.out.println("Enter new element:");
				val= sc.nextInt();
				list.addLast(val);
				break;
			case 4: //Add At Pos
				System.out.println("Enter new element:");
				val= sc.nextInt();
				list.addLast(val);
				System.out.println("Enter element position:");
				pos= sc.nextInt();
				list.addAtPos(val, pos);
				//list.addAtPos(val);
			case 5: //Del First
				try {
				list.delFirst();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6: //Del Last
				break;
			case 7: //Del At Pos
				System.out.println("Enter element position:");
				pos= sc.nextInt();
				list.delAtPos(pos);
				break;
			case 8: //Del All
				list.delAll();
				break;
			
			}
		}while (choice!=0);
		sc.close();
		
	}
}

class SinglyLinkList {
	//Node is static member class of SinglyList
	static class Node{
		
		//Node Class fields
		
		private int data; //This represents data of the linked list
		private Node next; //This represents pointer of the next node.
		public Node() {
			data =0;
			next=null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
		// List class fields
		private Node head;
		// List class Methods
		public SinglyLinkList() {
			head= null;
		}
		void display() {
			System.out.println("List:");
			Node trav = head;
			while(trav!=null) {
				System.out.println(trav.data);
				trav=trav.next;
			}
			System.out.println("");
		}
		void addFirst(int val) {
			//create new node and init it
			Node newNode = new Node(val);
			// new node next should point to head
			newNode.next = head;
			//head should point to new node
			head = newNode; 
		}
		void addLast(int val) {
			//Create new node & init it
			Node newNode = new Node(val);
			
			//Special 1: if list is empty, make new node as first node of list
			if(head == null) {
				head =newNode;
			}
			else {
			//traverse till last node
			Node trav =  head;
			while(trav.next !=null)
				trav = trav.next;
			
			//add new node after trav (trav.next)
			trav.next = newNode;
			}
		}
		
		public void addAtPos(int val, int pos) {
			//Special 1: if list is empty, add node at the start 
			//Special 2: is pos<=1, add node at the start
			if(head== null || pos<=1)
				addFirst(val);
			//general: add not at given pos
			else {
			//allocate and init new node
			Node newNode = new Node(val);
			
			//traverse till pos-1 (trav)
			Node trav = head;
			for (int i=1; i < pos-1; i++)
				trav = trav.next;
			//newnode's next should point to trav's next
			newNode.next = trav.next;
			//trav's next should point to newNode
			trav.next = newNode;
		}
	}
		public void delFirst() {
			//Special 1: if list is empty, throw exception
			if(head==null) 
				throw new RuntimeException("List is Empty.");
			//general: make head pointing to new node
			head = head.next;
			//note: the old first node will be garbage collected
		}
		
		public void delAll() {
			head = null;
			//all nodes will be garbage collected.
		}
		
		public void delAtPos(int pos) {
			
			//special 1: if pos=1, delete first node
			if (pos==1)
				delFirst();
			
			//special 2: if list is empty or pos < 1, then throw exception.
			if (head==null || pos<1)
				throw new RuntimeException("List is empty or Invalid Exception");
			
			//take temp pointer traversing running behind trav.
			Node temp = null, trav =head;
			
			//traverse till pos(trav)
			for(int i=1; i<pos; i++) {
				//Special 3: if pos is beyond list length, then throw exception.
				if(trav==null)
					throw new RuntimeException("Invalid Position.");
				temp = trav;
				temp.next = trav.next;
			}
			temp.next= trav.next;
			//trav node will be garbage collected.
		}
}

class SinglyLinkedList{
	public static void main(String agrs[]) {
		int choice, val, pos;
		
		SinglyLinkList list = new SinglyLinkList();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add at Pos\n5. Del First\n6. Del Last\n7. Del At Position\n8. Delete All\nEnter Choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: //Display
				list.display();
				break;
			case 2: //Add First
				System.out.println("Enter new element:");
				val= sc.nextInt();
				list.addFirst(val);
				break;
			case 3: //Add Last
				System.out.println("Enter new element:");
				val= sc.nextInt();
				list.addLast(val);
				break;
			case 4: //Add At Pos
				System.out.println("Enter new element:");
				val= sc.nextInt();
				list.addLast(val);
				System.out.println("Enter element position:");
				pos= sc.nextInt();
				list.addAtPos(val, pos);
				//list.addAtPos(val);
			case 5: //Del First
				try {
				list.delFirst();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6: //Del Last
				break;
			case 7: //Del At Pos
				System.out.println("Enter element position:");
				pos= sc.nextInt();
				list.delAtPos(pos);
				break;
			case 8: //Del All
				list.delAll();
				break;
			
			}
		}while (choice!=0);
		sc.close();
		
	}
}