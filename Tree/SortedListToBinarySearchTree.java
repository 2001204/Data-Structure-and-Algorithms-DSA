public class SortedListToBinarySearchTree
 {
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }

    public TreeNode SortedListToBinarySearchTree(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode mid = findMiddle(head);
        TreeNode root = new TreeNode(mid.val);

        if (head == mid) {
            return root;
        }

        root.left = SortedListToBinarySearchTree(head);
        root.right = SortedListToBinarySearchTree(mid.next);

        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        SortedListToBinarySearchTree solution = new SortedListToBinarySearchTree();
        TreeNode root = solution.SortedListToBinarySearchTree(head);

        System.out.println("In-order traversal of the BST:");
        solution.inOrderTraversal(root);
    }
}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

/*
D:\ADS Workspace\Tree>java SortedListToBinarySearchTree.java
In-order traversal of the BST:
1 2 3 4 5
*/
=================================================================================================