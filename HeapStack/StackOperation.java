class StackOperation{

	static final int MAX = 100;
	int top;
	int a[] = new int[MAX];
	
	void Stack()
	{
		top = -1;
	}	
	
	boolean isEmpty()
	{
       		return ( top < 0 ) ;
	}
	boolean isFull()
	{
       		return ( top == (MAX-1) ) ;
	}
	
	void push(int x)
	{
		if(top >= (MAX -1) )
		{
			System.out.println("Stack Overflow !!!!");
			// return false;     if return type boolean
		}
		else
		{
			a[++top] = x;
			System.out.println(x+"Push.");
			//return true;       if return type boolean
		}
		
	}
	int pop()
	{
		if(top < 0 )
		{
			System.out.println("Stack Underflow !!!!");
		}
		else
		{
			int y= a[top--] ;
			//System.out.println(y+ "Poped.");
			return y;
		}
	}
	public static void main(String args[])
	{
		StackOperation s1 = new StackOperation();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.pop();
		s1.push(40);
		s1.push(50);
		System.out.println(s1.pop() + "Popped Element.");
		
	}

}