package f_LinkedList;
public class ConvertArr2LL {
    public static Node Arr2LL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i = 1; i < arr.length; i++) {
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
    }

    public static int LengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {19, 34, 1, 76, 9, 21};
        Node head = Arr2LL(arr);
//        System.out.println(head.next);

        Node temp = head;
        while(temp != null) {
//            System.out.println(temp.data + ", " + temp.next);
            temp = temp.next;
        }

       int len = LengthOfLL(head);
        System.out.println(len);
    }

}
