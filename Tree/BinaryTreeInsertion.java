
// Binary tree insertion in Existing tree

class BinaryTreeInsertion {

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
	BinaryTreeInsertion()
	{
		root = null;
	}
	BinaryTreeInsertion(int d)
	{
		new Node(d);
	}

public static void main(String args[])
	{
		BinaryTreeInsertion t1 = new BinaryTreeInsertion();

		t1.root = new Node(10);
		t1.root.left = new Node(20);
		t1.root.right = new Node(30);
		t1.root.left.left = new Node(40);
		t1.root.left.right = new Node(50);
		System.out.println("Before Inserting : ");
		t1.print();
		t1.insert(35);
		t1.insert(60);
		System.out.println("\n---------------------------");
		System.out.println("After Inserting nodes : ");
		t1.print();

	}

	void printOrder(Node root)
		{
			if(root == null)
	 		return;
			printOrder(root.left);
			System.out.print(root.data + " " );
			printOrder(root.right);
	}
	void print()
		{
			printOrder(root);
	    }

    // Insert a value into the BST
    public void insert(int value)
 	{
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value)
	{
      		if (root == null)
      		{
         	 	  root = new Node(value);
          		  return root;
       		}
        	if (value < root.data)
	 		{
           		 root.left = insertRec(root.left, value);
       		}
			else if (value > root.data)
	 		{
           		 root.right = insertRec(root.right, value);
        	}

        return root;
    }
}




/*
D:\ADS Workspace\Tree>java BinaryTreeInsertion.java
Before Inserting :
40 20 50 10 30
---------------------------
After Inserting nodes :
40 20 50 10 30 35 60
*/