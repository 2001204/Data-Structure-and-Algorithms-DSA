Linked List

1.Deletion at the begining
2.Deltion at the end
3.Delete in between
=============================================
//Delete particular node by Key
```
void deleteNode(int key)//key=30
{
	Node temp = head, prev = null;
	if(temp != null && temp.data == key)
	{
		head = temp.next;
		return;
	}
	//Last or intermediate
	while(temp != null && temp.data != key)
	{
		prev = temp;
		temp = temp.next;
	}
	if(temp == null)
	return;
	prev.next = temp.next;


}

========================================
//Delete particular node by position

void deletenode(int position)
{
	if (head == null)
		return;
	Node temp = head, last = null;
//Deletion at begining
	if(position == 0)
	{
		head = temp.next;
	}
//Deletion at the intermidiate position
	   for (int i = 0 ; temp != null && i<position-1; i++)
		{
			temp = temp.next;
		}
	if(temp == null || temp.next == null)
	{
		return;
	}

	Node last = temp.next.next;
	temp.next = last;
}





