package day12;

import java.util.Scanner;
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
public class DoublyLinkedList {
    Node head = null;
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAtPosition(int data,int n) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < n && temp != null; i++) temp = temp.next;
        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) temp.next.prev = newNode;
            temp.next = newNode;
        }
    }
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            if (head != null) head.prev = null;
        }
    }
    public void deleteLast() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        if (temp.prev != null) temp.prev.next = null;
        else head = null;
    }
    public void deleteMiddle(int n) {
        Node temp = head;
        for (int i = 1; i < n && temp != null; i++) temp = temp.next;
        if (temp != null && temp.prev != null && temp.next != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    public void displayForward() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            dll.insertEnd(sc.nextInt());
        }
        dll.displayForward();
        dll.insertBeginning(100);
        System.out.println("After inserting 100 at beginning:");
        dll.displayForward();
        dll.insertEnd(200);
        System.out.println("After inserting 200 at end:");
        dll.displayForward();
        System.out.println("Enter the position for inserting");
        int y=sc.nextInt();
        dll.insertAtPosition(300,y);
        System.out.println("After inserting 300 at 3rd position:");
        dll.displayForward();
        dll.deleteFirst();
        System.out.println("After deleting first node:");
        dll.displayForward();
        dll.deleteLast();
        System.out.println("After deleting last node:");
        dll.displayForward();
        System.out.println("Enter the position for Deleting:");
        int x=sc.nextInt();
        dll.deleteMiddle(x);
        System.out.println("After deleting middle node:");
        dll.displayForward();
    }
}