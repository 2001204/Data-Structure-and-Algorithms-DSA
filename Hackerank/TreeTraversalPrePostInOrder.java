import java.util.*;
import java.io.*;


class TreeTraversalPrePostInOrder {

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
	System.out.println("\nInorder traversal : ");
	inOrder(root);
	System.out.println("\nPreorder traversal : ");
	preOrder(root);
	System.out.println("\nPostorder traversal : ");
	postOrder(root);
    }	

/*
public static void inOrder(Node root) {
    if(root!=null)
    {
        if(root.left!=null)
        {
            inOrder(root.left);
        }
        System.out.print(root.data + " ");
        if(root.right!=null)
        {
            inOrder(root.right);
        }
    }
        
    }

public static void preOrder(Node root) {
         System.out.print(root.data + " ");
    	if (root.left != null) {
      	  	preOrder(root.left);
    	} 
    	if (root.right != null) {
        	preOrder(root.right);
    	}
    }   */


public static void inOrder(Node root) {
        if (root != null) {
            postOrder(root.left); 
		System.out.print(root.data + " ");  
            postOrder(root.right);
            
        }
    }
public static void preOrder(Node root) {
        if (root != null) {
		System.out.print(root.data + " ");
     		postOrder(root.left);   
       		postOrder(root.right);
   
        }
    }

public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);   
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }


public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node current;
            if(data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            } else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
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
D:\ADS Workspace\Hackerank>java TreeTraversalPrePostInOrder.java
Enter the Number of Nodes :
10
Enter 10 Nodes :
20 8 59 41 63 39 78 45 25 90

Inorder traversal :
8 20 25 39 45 41 90 78 63 59
Preorder traversal :
20 8 25 39 45 41 90 78 63 59
Postorder traversal :
8 25 39 45 41 90 78 63 59 20
*/