class MyRecursive2
{
	static int i = 0;
	public static void main(String args[])
		{
			display();

		}
	static void display()   //Recursive function
	{
		++i;
		if(i<5)     //termination cond
		{
		System.out.println("We are Gamechangers.......");
		System.out.println("This is finite recursive program");

		display();
		}

	}
}