package LinkedList.DoublyLinkedList;

class Node {
    int data;
    Node prev; // Pointer to the previous node
    Node next; // Pointer to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

   
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    
    void traverseForward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        System.out.print("Forward Traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

   
    void traverseBackward() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = tail;
        System.out.print("Backward Traversal: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding nodes to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        
        list.traverseForward();

        
        list.traverseBackward();
    }
}

