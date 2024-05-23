package f_LinkedList;

public class WorkOnLL {
    public static Node removeHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static Node arr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
    int[] arr = {12, 32, 45, 22, 27};
    Node head = arr2LL(arr);
    Node newLL = removeHead(head);
        System.out.println(newLL.data);
    }
}
