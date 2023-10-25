//Binary tree traversal Inorder/ Preorder/ Postorder

class BinaryTreeTraversal{
	Node root;
	static class Node
	{
		int data;
		Node left, right;
		Node(int d)
		{
			data = d;
			left= right = null;
		}

	}
	void BinaryTreeTraversal()
	{
		root = null;
	}
	void BinaryTreeTraversal(int d)
	{
		new Node(d);
	}

	void printInorder(Node root)
	{
		if(root == null)
 		return;
		printInorder(root.left);
		System.out.print(root.data + " " );
		printInorder(root.right);
	}

	void printPreorder(Node root)
	{
		if(root == null)
 		return;
		System.out.print(root.data + " " );
		printPreorder(root.left);
		printPreorder(root.right);
	}

	void printPostorder(Node root)
	{
		if(root == null)
 		return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data + " " );
	}

	void Inorder()
	{
		printInorder(root);
	}

	void Preorder()
	{
		printPreorder(root);
	}

	void Postorder()
	{
		printPostorder(root);
	}

	public static void main(String args[])
	{
		BinaryTreeTraversal t1 = new BinaryTreeTraversal();

		t1.root = new Node(60);
		t1.root.left = new Node(20);
		t1.root.right = new Node(70);
		t1.root.left.left = new Node(10);
		t1.root.left.right = new Node(40);
		t1.root.left.right.left = new Node(30);
		t1.root.left.right.right = new Node(50);

		System.out.print( "Preorder  : " );
		t1.Preorder();
		System.out.println("\n-----------------------------");
		System.out.print( "Inorder  : " );
		t1.Inorder();
		System.out.println("\n-----------------------------");

		System.out.print( "Postorder  : " );
		t1.Postorder();
		System.out.println("\n-----------------------------");
	}
}

/*

D:\ADS Workspace\Tree>java BinaryTreeTraversal.java
Preorder  : 60 20 10 40 30 50 70
-----------------------------
Inorder  : 10 20 30 40 50 60 70
-----------------------------
Postorder  : 10 30 50 40 20 70 60
-----------------------------
*/