package LinkedList.CircularLinkedList.SinglyCircular;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {
    Node head;


    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }


    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (temp.next == head || temp.next.next == head) {
            System.out.println("Position out of range.");
            return;
        }

        temp.next = temp.next.next;
    }


    void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while (temp.next != head && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next.data == value) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value not found.");
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Deletion list = new Deletion();

        
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = list.head;

        System.out.println("Original List:");
        list.display();

        list.deleteFirst();
        System.out.println("After deleting first node:");
        list.display();

        list.deleteLast();
        System.out.println("After deleting last node:");
        list.display();

        list.deleteByValue(20);
        System.out.println("After deleting node with value 20:");
        list.display();
    }
}
