package f_LinkedList;
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LearnLL {
    public static void main(String[] args) {
        Node x = new Node(5);
        Node y = new Node(10, x);
        System.out.println(y.next);
    }
}
