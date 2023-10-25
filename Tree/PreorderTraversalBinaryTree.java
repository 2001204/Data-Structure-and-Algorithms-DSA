//Binary tree Preorder traversal

class PreorderTraversalBinaryTree
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
	
	PreorderTraversalBinaryTree()
	{
		root = null;
	}
	PreorderTraversalBinaryTree(int d)
	{
		new Node(d);
	}
	
	void printPreorder(Node root)
	{
		if(root == null)
		return; 
		System.out.print(root.data + "  ");
		printPreorder(root.left);
		printPreorder(root.right);	
	}
	void Preorder()
	{	
		printPreorder(root);
	}
	
	public static void main(String args[])
	{
		PreorderTraversalBinaryTree T1= new  PreorderTraversalBinaryTree();
		
		T1.root = new Node(5);
		T1.root.left = new Node(15);
		T1.root.right = new Node(20);
		T1.root.left.left = new Node(45);
		T1.root.left.right = new Node(56);
		T1.root.right.left = new Node(25);
		T1.root.right.right = new Node(35);
		System.out.println("Tree Traversing In Preorder : ");
		T1.Preorder();
	}
}

/*
D:\ADS Workspace\Tree>java PreorderTraversalBinaryTree.java
Tree Traversing In Preorder :
5  15  45  56  20  25  35*/