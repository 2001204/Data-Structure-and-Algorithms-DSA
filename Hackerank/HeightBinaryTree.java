// Tree: Height of a Binary Tree

import java.util.*;
import java.io.*;

class HeightBinaryTree
{

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number of Nodes : ");
        int t = scan.nextInt();

	System.out.println("Enter "+t+" Nodes : "); 
        Node root = null;
        while(t -- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println("Height of tree is : " + height);
    }	

	public static int height(Node root)
	 {
        	if(root == null) {
            		return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }



public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else 
	{
            Node temp;
            if(data <= root.data) {
                temp = insert(root.left, data);
                root.left = temp;
            } else
	 {
                temp = insert(root.right, data);
                root.right = temp;
            }
            return root;
        }
    }
}
class Node {
 	int data;
    	Node left;
    	Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


/*
D:\ADS Workspace\Hackerank>java HeightBinaryTree.java
Enter the Number of Nodes :
10
Enter10 Nodes :
45 78 26 12 265 26 156 62 66 10
Height of tree is : 3
*/