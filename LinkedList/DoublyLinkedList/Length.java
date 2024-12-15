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

   
    int getLength() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

      
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Length of the list: " + list.getLength());
    }
}

