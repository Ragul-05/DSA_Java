package LinkedList.CircularLinkedList.DoublyCircular;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class DoublyCircularLinkedList {
    Node head;

   
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node tail = head.prev;
        newNode.next = head;
        newNode.prev = tail;
        tail.next = head.prev = newNode;
        head = newNode;
    }

    
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) { 
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node tail = head.prev;
        newNode.next = head;
        newNode.prev = tail;
        tail.next = head.prev = newNode;
    }

   
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 1 || head == null) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        int count = 1;

        
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}

public class Insertion {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

       
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.insertAtEnd(20);
        list.insertAtEnd(25);

       
        list.insertAtPosition(15, 3); 
        list.insertAtPosition(30, 10); 

        list.display();
    }
}

