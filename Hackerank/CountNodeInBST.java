//H3: Find the Number of Nodes in a Binary Search Tree

import java.io.*;
 
class CountNodeInBST {

public static void main(String args[])
    {
        Node root = newNode(3);
        root.left = newNode(4);
        root.right = newNode(2);
        root.left.left = newNode(5);
        root.left.right = newNode(1);
        
System.out.print("Total No. of Nodes in the BST = ");
        System.out.println(countNodes(root));
         
    }
    static class Node
    { 
        public int data;
        public Node left, right;
        public Node(){
            data = 0;
            left = right = null;
        }
 
    }
    static int countNodes(Node root)
    {
        if (root == null)
            return 0;
     
        int l = countNodes(root.left);      
        int r = countNodes(root.right);
     
        return 1 + l + r;
    }
     static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }
}
 
/*
PS D:\ADS Workspace\Hackerank> java CountNodeInBST.java
Total No. of Nodes in the BST = 5
*/
