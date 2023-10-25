class BinarySearchTreeDeletion {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    BinarySearchTreeDeletion() {
        root = null;
    }

    BinarySearchTreeDeletion(int d) {
        root = new Node(d);
    }

    Node insertData(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key <= root.data)
            root.left = insertData(root.left, key);
        else
            root.right = insertData(root.right, key);
        return root;
    }

    void insert(int key) {
        root = insertData(root, key);
    }

    void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    void printPreorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    void printPostorder(Node root) {
        if (root == null)
            return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }

    Node deleteData(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteData(root.left, key);
        } else if (key > root.data) {
            root.right = deleteData(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteData(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    void delete(int key) {
        root = deleteData(root, key);
    }

    void inorder() {
        printInorder(root);
    }

    void preorder() {
        printPreorder(root);
    }

    void postorder() {
        printPostorder(root);
    }

    public static void main(String[] args) {
        BinarySearchTreeDeletion t1 = new BinarySearchTreeDeletion(2);

        t1.insert(10);
        t1.insert(8);
        t1.insert(25);
        t1.insert(22);
        t1.insert(42);
        t1.insert(9);
        t1.insert(5);

        System.out.println("Binary Search Tree Deletion:");
        System.out.println("-----------------------------");
        System.out.print("Preorder  : ");
        t1.preorder();
        System.out.println("\n-----------------------------");
        System.out.print("Inorder   : ");
        t1.inorder();
        System.out.println("\n-----------------------------");
        System.out.print("Postorder : ");
        t1.postorder();
        System.out.println("\n-----------------------------");

        t1.delete(9);
System.out.println("After deleting 9  : ");
        t1.inorder();
        System.out.println("\n-----------------------------");

        t1.delete(5);
System.out.println("After deleting 5  : ");
        t1.inorder();
        System.out.println("\n-----------------------------");

        t1.delete(25);
System.out.println("After deleting 25  : ");
        t1.inorder();
    }
}
