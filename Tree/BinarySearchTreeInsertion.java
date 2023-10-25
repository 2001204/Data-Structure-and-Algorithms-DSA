//Binary Search Tree  BST--insert node in thr tree

class BinarySearchTreeInsertion {
    	Node root;

    	static class Node {
        	int data;
        	Node left, right;

       	 	Node(int d) {
           	 data = d;
           	 left = right = null;
        	}
    	}

    	BinarySearchTreeInsertion() {
        	root = null;
   	 }

   	 BinarySearchTreeInsertion(int d) {
    	    	root = new Node(d);
  	  }
	Node insertdata(Node root, int key)
	{
 		if ( root == null)
		{
			root = new Node( key );
			return root;
		}
		if(key <= root.data)
			root.left = insertdata( root.left, key );
		else
			root.right = insertdata(root.right, key);
		return root;
	}

	void insert(int key)
	{
		root = insertdata(root, key);
	}
   	 static void printOrder(Node root) {
      	  	if (root == null)
            	return;

        	printOrder(root.left);

        	System.out.print(root.data + " ");

        	printOrder(root.right);
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
        	BinarySearchTreeInsertion t1 = new BinarySearchTreeInsertion();

        	t1.insert(35);
		t1.insert(20);
		t1.insert(10);
		t1.insert(45);
		t1.insert(39);
		t1.insert(25);

     		System.out.print("Binary search Tree Insertion :");
        	//printOrder(t1.root);
		System.out.println("\n-----------------------------");
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
D:\ADS Workspace\Tree>java BinarySearchTree.java
Binary search Tree Insertion:
-----------------------------
Preorder  : 35 20 10 25 45 39
-----------------------------
Inorder  : 10 20 25 35 39 45
-----------------------------
Postorder  : 10 25 20 39 45 35
-----------------------------
*/

