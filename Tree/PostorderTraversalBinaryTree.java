//Binary tree Postorder traversal 

class PostorderTraversalBinaryTree
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
	
	PostorderTraversalBinaryTree( )
	{
		root = null;
	}
	PostorderTraversalBinaryTree(int d)
	{
		new Node(d);
	}
	
	void printPostorder(Node root)
	{
		if(root == null)
 		return;
		printPostorder(root.left);
		printPostorder(root.right);	
		System.out.print(root.data + " " );	
	}
	void Postorder()
	{	
		printPostorder(root);
	}
	
	public static void main(String args[])
	{
		PostorderTraversalBinaryTree T1= new  PostorderTraversalBinaryTree();
		
		T1.root = new Node(5);
		T1.root.left = new Node(15);
		T1.root.right = new Node(20);
		T1.root.left.left = new Node(45);
		T1.root.left.right = new Node(56);
		T1.root.right.left = new Node(25);
		T1.root.right.right = new Node(35);
		System.out.println("Tree Traversing In PostOrder: ");
		T1.Postorder();
	}
}

/*
D:\ADS Workspace\Tree>java PostorderTraversalBinaryTree.java
Tree Traversing In PostOrder:
45 56 15 25 35 20 5s

*/