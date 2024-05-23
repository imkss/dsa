package f_LinkedList;
public class BasicsOnLL {
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

    public static void printLL (Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static boolean searchInLL(Node head, int num) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == num) return true;
            temp = temp.next;
        }
        return false;
    }

    public static Node removeHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static Node removeTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {19, 34, 1, 76, 9, 21};
        Node head = arr2LL(arr);
//        System.out.println(head.next);
//        System.out.println(lengthOfLL(head));
//        System.out.println(searchInLL(head, 18));
//        printLL(removeHead(head));
        printLL(removeTail(head));
    }

}
