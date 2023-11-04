public class MaxMinInBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        int minValue = tree.findMin();
        int maxValue = tree.findMax();

        System.out.println("Minimum value in the BST: " + minValue);
        System.out.println("Maximum value in the BST: " + maxValue);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public int findMin() {
        return findMinRec(root);
    }

    private int findMinRec(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("The tree is empty.");
        }

        while (node.left != null) {
            node = node.left;
        }

        return node.data;
    }

    public int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("The tree is empty.");
        }

        while (node.right != null) {
            node = node.right;
        }

        return node.data;
    }
}

/*
D:\ADS Workspace\Tree>java MaxMinInBinarySearchTree.java
Minimum value in the BST: 20
Maximum value in the BST: 80
*/

