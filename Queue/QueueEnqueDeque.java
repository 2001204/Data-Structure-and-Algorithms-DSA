// Queue Enqueue and Dequeue Operations.

class QueueEnqueDeque
{
	int size = 6;
	int Q[] = new int[size];
	int front, rear, x;

	public static void main(String args[])
	{
		QueueEnqueDeque q = new QueueEnqueDeque();
		q.enqueue(1);      //underflow
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(30);    //overflow
		q.display();
		q.dequeue();
		q.display();
	}
	Queue()
	{
		front = -1;
		rear = -1;
	}

	boolean isFull()
	{
		if(front == 0 && rear == size-1)
		{
			return true;
		}
		return false;	
	}
	
		boolean isEmpty()
	{
		if(front == -1)
		
			return true;
		else
			return false;	
	}
	
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Full !!!");
		}
		else
		{
			if(front == -1)
				front = 0;
			rear++;
			Q[rear] = x;
			System.out.println(x+" Inserted");
			
		}
	}
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!!");
			return -1;
		}
		else
		{
			x=Q[front];
			if(front >= rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			System.out.println(x+" Deleted !!!\n");
			return x;
		}
			
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty !!!");
		}
		else
		{
			System.out.println("Front :"+front);
			System.out.println("\n---------\n");
			for(int i = front;i<=rear;i++)
				System.out.print(Q[i]+" ");
			
			System.out.println("\nRear :"+rear);
		}
	}
		
}

/*
java -cp /tmp/0lamUfV9oq Queue
1 Inserted
5 Inserted
10 Inserted
15 Inserted
20 Inserted
25 Inserted
Full !!!
Front :0
---------
1 5 10 15 20 25 Rear :5
1 Deleted !!!
Front :1
---------
5 10 15 20 25 
Rear :5

*/
