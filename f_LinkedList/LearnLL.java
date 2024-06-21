package f_LinkedList;class Node {
    int data; // This variable holds the data for the node.
    Node next; // This variable holds the reference to the next node in the list.

    // Constructor to initialize the node with data; the next is set to null.
    Node (int data) {
        this.data = data;
        this.next = null;
    }

    // Constructor to initialize the node with data and a reference to the next node.
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LearnLL {
    public static void main(String[] args) {
        Node last = new Node(5); // Creates the last node with data 5.
        Node middle = new Node(7, last); // Creates the middle node with data 7 and points to the last node.
        Node first = new Node(12, middle); // Creates the first node with data 12 and points to the middle node.

    }
}
