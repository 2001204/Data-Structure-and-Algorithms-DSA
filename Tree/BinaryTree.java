class BinaryTree {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BinaryTree() {
        root = null;
    }

    BinaryTree(int d) {
        root = new Node(d);
    }

    
    static void printOrder(Node root) {
        if (root == null)
            return;

        printOrder(root.left);

        System.out.print(root.data + " ");
   
        printOrder(root.right);
    }

    public static void main(String args[])
 {
        BinaryTree t1 = new BinaryTree();

        t1.root = new Node(10);
        t1.root.left = new Node(20);
        t1.root.right = new Node(30);

        t1.root.left.left = new Node(40);
        t1.root.left.right = new Node(50);

        System.out.println("Tree Traversal:");
        printOrder(t1.root);
    }
}


/*
D:\ADS Workspace\Tree>java BinaryTree.java
Tree Traversal:
40 20 50 10 30
*/