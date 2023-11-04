public class SortedArrayToBinarySearchTree {
    public TreeNode SortedArrayToBinarySearchTree(int[] nums) {
        return SortedArrayToBinarySearchTree(nums, 0, nums.length - 1);
    }

    private TreeNode SortedArrayToBinarySearchTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = SortedArrayToBinarySearchTree(nums, left, mid - 1);
        root.right = SortedArrayToBinarySearchTree(nums, mid + 1, right);

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
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        SortedArrayToBinarySearchTree solution = new SortedArrayToBinarySearchTree();
        TreeNode root = solution.SortedArrayToBinarySearchTree(sortedArray);

        System.out.println("In-order traversal of the BST:");
        solution.inOrderTraversal(root);
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
D:\ADS Workspace\Tree>java SortedArrayToBinarySearchTree.java
In-order traversal of the BST:
1 2 3 4 5 6 7
*/
