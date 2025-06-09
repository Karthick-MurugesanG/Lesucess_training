package day14;

public class ArrayQueue {
	private int front, rear;
    private int[] queue = new int[100];

    public ArrayQueue() {
        front = rear = -1;
    }

    public void enqueue(int data) {
        if (rear == 99) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = data;
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Array Queue:");
        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(10); aq.enqueue(20); aq.enqueue(30);
        aq.display();
        aq.dequeue(); aq.display();
    }
}