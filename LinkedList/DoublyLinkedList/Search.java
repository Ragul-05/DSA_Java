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

    
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    
    boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Is 20 in the list? " + list.search(20)); // Output: true
        System.out.println("Is 50 in the list? " + list.search(50)); // Output: false
    }
}

