public class IsBinarySearchTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construct a sample binary tree
        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(3);

        boolean isBST = tree.isBST();

        if (isBST) {
            System.out.println("The tree is a Binary Search Tree.");
        } else {
            System.out.println("The tree is not a Binary Search Tree.");
        }
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

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Helper function for checking if the tree is a BST
    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        // Check the current node's value against the minimum and maximum values
        if (node.data < min || node.data > max) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max);
    }

    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

/*

D:\ADS Workspace\Tree>java IsBinarySearchTree.java
The tree is a Binary Search Tree.
*/
