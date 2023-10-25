//hello   Binary tree traversal Inorder/ Preorder/ Postorder

class BinaryTreeTraversal2{
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
	BinaryTreeTraversal2()
	{
		root = null;
	}
	BinaryTreeTraversal2(int d)
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
		BinaryTreeTraversal2 t1 = new BinaryTreeTraversal2();

		t1.root = new Node(25);
		t1.root.left = new Node(15);
		t1.root.right = new Node(50);
		t1.root.left.left = new Node(10);
		t1.root.left.right = new Node(22);
		t1.root.left.left.left = new Node(4);
		t1.root.left.left.right = new Node(12);
		t1.root.left.right.left = new Node(18);
		t1.root.left.right.right = new Node(24);

		t1.root.right.left = new Node(35);
		t1.root.right.left.left = new Node(31);
		t1.root.right.left.right = new Node(31);
		t1.root.right.right = new Node(70);
		t1.root.right.right.left = new Node(66);
		t1.root.right.right.right = new Node(90);

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
D:\ADS Workspace\Tree>java BinaryTreeTraversal2.java
Preorder  : 25 15 10 4 12 22 18 24 50 35 31 31 70 66 90
-----------------------------
Inorder  : 4 10 12 15 18 22 24 25 31 35 31 50 66 70 90
-----------------------------
Postorder  : 4 12 10 18 24 22 15 31 31 35 66 90 70 50 25
-----------------------------s
*/