//Binary tree Inorder traversal
class InorderTraversalBinaryTree
{
	Node root;
	static class Node
	{
		int data;
		Node left, right ;
		Node (int d)
		{
			data = d;
			left = right =null;
		}
	}
	
	InorderTraversalBinaryTree()
	{
		root = null;
	}
	InorderTraversalBinaryTree(int d)
	{
		new Node(d);
	}
	
	void printInorder(Node root)
	{
		if(root == null)
		return;
		printInorder(root.left);
		System.out.print(root.data+ "  ");
		printInorder(root.right);
	}
	void Inorder()
	{
		printInorder(root);
	}
	
	public static void main(String args[])
	{
		InorderTraversalBinaryTree T1= new  InorderTraversalBinaryTree();
		
		T1.root = new Node(5);
		T1.root.left = new Node(15);
		T1.root.right = new Node(20);
		T1.root.left.left = new Node(45);
		T1.root.left.right = new Node(56);
		T1.root.right.left = new Node(25);
		T1.root.right.right = new Node(35);
		System.out.println("Tree Traversing In InOrder : ");
		T1.Inorder();
	}
}
/*
D:\ADS Workspace\Tree>java InorderTraversalBinaryTree.java
Tree Traversing In InOrder :
5  15  45  56  20  25  35
*/