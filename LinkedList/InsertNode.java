1.Insertion at the begining
2.Insertion at the end
3.Insertion in between
1.Insertion at the begining:
=====================================
#### Starting node
```
void insert(int new_data)
{
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
}
=======================================
```
2.Insertion at the end:
#### Last node

```
void append(int new_data)
{
	
Node new_node = new Node(10);
//list is empty ? check
if(head == null)
	{
		head = new_node(10);
		return;
	}

new_node.next = null;
Node last = head;
while(last.next != null)
{
	last = last.next;
}
last.next = new_node;
return;
}

==========================================
```
3.Insertion in between:
#### Middle node
```
void insertAfter(Node prev_node,int new_data)
{
	

if(prev_node == null)
{
	System.out.println("Empty list !!!");
	return;
}

Node new_node = new Node(10);
new_node.next = prev_node.next;
prev_node.next = new_node;
}
```