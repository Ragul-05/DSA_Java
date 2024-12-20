package Stack;
class Node {
    int data;
    Node next;

   
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLinkedList {
    private Node top;

    StackUsingLinkedList() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Pushed " + data + " onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! The stack is empty.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return top.data;
    }

    
    public boolean isEmpty() {
        return top == null;
    }

    
    public void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackOperations_LinkedList {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

       
        stack.push(10);
        stack.push(20);
        stack.push(30);

        
        stack.display();

       
        System.out.println("Top element: " + stack.peek());

   
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

   
        stack.display();

       
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

