//H4: Check whether a Binary T1 is BST (Binary Search T1) or not

public class BinaryTreecheckBST {
    Node root;
    int prev = Integer.MIN_VALUE;

    public static void main(String[] args) {
        BinaryTreecheckBST T1 = new BinaryTreecheckBST();

       
        T1.root = new Node(8);
        T1.root.left = new Node(3);
        T1.root.right = new Node(10);
        T1.root.left.left = new Node(1);
        T1.root.left.right = new Node(6);
        T1.root.left.right.left = new Node(4);
        T1.root.left.right.right = new Node(7);
        T1.root.right.right = new Node(14);
        T1.root.right.right.left = new Node(13);

        if (T1.checkBST()) {
            System.out.println("The T1 is a Binary Search Tree.");
        } else {
            System.out.println("The T1 is not a Binary Search Tree.");
        }
    }

    boolean checkBST() {
        return checkBST(root);
    }

    boolean checkBST(Node node) {
        if (node == null) {
            return true; 
        }
        if (!checkBST(node.left)) {
            return false;
        }
        if (node.data <= prev) {
            return false;
        }
        prev = node.data;

        return checkBST(node.right);
    }
}
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
/*
PS D:\ADS Workspace\Hackerank> java BinaryTreecheckBST.java
The T1 is a Binary Search Tree.
*/