
import java.io.*;
import java.util.*;

class  MinimumofStack{

	public static void main(String[] args)
	{
		MinStack s = new MinStack();
	
		s.push(2);
		s.push(3);
		s.pop();
		System.out.println(s.getMin());
		s.push(1);
		System.out.println(s.getMin());
	}
}


class MinStack {
	Stack<Node> s;

	class Node {
		int val;
		int min;
		public Node(int val, int min)
		{
			this.val = val;
			this.min = min;
		}
	}

	public MinStack() 
	{ 
		this.s = new Stack<Node>(); 
	}
	public void push(int x)
	{
		if (s.isEmpty()) {
			this.s.push(new Node(x, x));
		}
		else {
			int min = Math.min(this.s.peek().min, x);
			this.s.push(new Node(x, min));
		}
	}
	public int pop()
	 {
		 return this.s.pop().val; 
	}
	public int top()
	 { 
		return this.s.peek().val; 
	}
	public int getMin() 
	{ 
		return this.s.peek().min; 
	}
}


/*
PS D:\ADS Workspace\Hackerank> java MinimumofStack.java
2
1
/*



