package LinkedList.DoublyLinkedList;

class Node {
    int data;
    Node prev;
    Node next;

   
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

   
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

   
    void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        } else {
            tail = newNode;
        }
    }

    // Print the list
    void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        
        list.insertAtTail(40);
        list.insertAtTail(50);

       
        Node secondNode = list.head.next; 
        list.insertAfter(secondNode, 25);

       
        System.out.print("List after insertions: ");
        list.printList();
    }
}
