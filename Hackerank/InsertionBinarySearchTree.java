// Binary Search Tree : Insertion

import java.util.*;
import java.io.*;

class InsertionBinarySearchTree {
  
  	public static void inOrder( Node root )
	 {
    			if( root == null)
        			return;
        		
        		inOrder(root.left);
System.out.print(root.data + " ");
        		inOrder(root.right);
    }
public static Node insert(Node root,int data)
 {
        if( root == null)
	{
            root = new Node(data);
            return root;
        }
        if(data <= root.data)
            root.left =insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

public static void main(String[] args)
 {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of nodes : ");
        int t = scan.nextInt();
	System.out.println("Enter "+ t +" Nodes : ");
        Node root = null;
        while(t --> 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
	System.out.println("Binary Search Tree After Insertion : ");
      	inOrder(root);
    }
}

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

/*
D:\ADS Workspace\Hackerank>java InsertionBinarySearchTree.java
Enter number of nodes :
10
Enter 10 Nodes :
4 5 6 8 9 4 3 2 8 8
Binary Search Tree After Insertion :
2 3 4 4 5 6 8 8 8 9
*/