// Deque 

class Deque {
  static final int MAX = 100;
  int arr[];
  int front;
  int rear;
  int size;// Take array size = n

  public Deque(int size) {
    arr = new int[MAX];
    //set pointers front and rear
    front = -1; 
    rear = 0;
    this.size = size;
  }

  boolean isFull() {
    return ((front == 0 && rear == size - 1) || front == rear + 1);
  }

  boolean isEmpty() {
    return (front == -1);
  }

  //Insert at the front
  void insertfront(int key) {
    //check for full queue
    if (isFull()) {
      System.out.println("Full");
      return;
    }
//check front position
    if (front == -1) {
      front = 0;
      rear = 0;
    }
//front < 1, reinitialize it to n-1(last index)
    else if (front == 0)
      front = size - 1;
//else decrese by 1
    else
      front = front - 1;
//insert new value at front i.e., arr[front]
    arr[front] = key;
  }

  void insertrear(int key) {
    // check array is full
    if (isFull()) {
      System.out.println(" Overflow ");
      return;
    }

    if (front == -1) {
      front = 0;
      rear = 0;
    }
// check deque is full rear = 0
    else if (rear == size - 1)
      rear = 0;
// increase the pointer by 1
    else
      rear = rear + 1;
// insert element arr[rear]
    arr[rear] = key;
  }

  void deletefront() {
    if (isEmpty()) {
      System.out.println("Queue Underflow\n");
      return;
    }

    // Deque has only one element
    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (front == size - 1)
      front = 0;

    else
      front = front + 1;
  }

  void deleterear() {
    if (isEmpty()) {
      System.out.println(" Underflow");
      return;
    }

    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (rear == 0)
      rear = size - 1;
    else
      rear = rear - 1;
  }

  int getFront() {
    if (isEmpty()) {
      System.out.println(" Underflow");
      return -1;
    }
    return arr[front];
  }

  int getRear() {
    if (isEmpty() || rear < 0) {
      System.out.println(" Underflow\n");
      return -1;
    }
    return arr[rear];
  }

  public static void main(String[] args) {

    Deque dq = new Deque(4);

    System.out.println("Insert element at rear end : 12 ");
    dq.insertrear(12);

    System.out.println("insert element at rear end : 14 ");
    dq.insertrear(14);

    System.out.println("get rear element : " + dq.getRear());

    dq.deleterear();
    System.out.println("After delete rear element new rear become : " + dq.getRear());

    System.out.println("inserting element at front end");
    dq.insertfront(13);

    System.out.println("get front element: " + dq.getFront());

    dq.deletefront();

    System.out.println("After delete front element new front become : " + +dq.getFront());

  }
}
/*
java -cp /tmp/aFBpZQNkW9 Deque
Insert element at rear end : 12 
insert element at rear end : 14 
get rear element : 14
After delete rear element new rear become : 12
inserting element at front end
get front element: 13
After delete front element new front become : 12

*/