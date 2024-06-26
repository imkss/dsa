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

    public static Node removeKthNode(Node head, int k) {
        if(head == null) return head;
        if(k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            cnt++;
            if(cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node removeVal(Node head, int val) {
        if(head == null) return head;
        if(head.data == val) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node addEleAtHead(Node head, int ele) {
       return new Node(ele, head);
    }

    public static Node addEleAtEnd(Node head, int ele) {
        if(head == null) return new Node(ele);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(ele);
        return head;
    }

    public static Node insertAtKthEle(Node head, int ele, int k) {
        if(head == null){
            if(k == 1) return new Node(ele);
            else return null;
        }
        if(k == 1) return new Node(ele, head);

        int cnt = 1;
        Node temp = head;
        while(temp != null) {
        cnt++;
        if(cnt == k) {
            Node x = new Node(ele, temp.next);
            temp.next = x;
            break;
        }
        temp = temp.next;
    }
    return head;
    }

    public static void main(String[] args) {
        int[] arr = {19, 34, 1, 76, 9, 21};
        Node head = arr2LL(arr);
            printLL(insertAtKthEle(head, 11, 2));
//        printLL(addEleAtEnd(head, 7));
//        System.out.println(head);
//        System.out.println(head.next);
//        System.out.println(lengthOfLL(head));
//        System.out.println(searchInLL(head, 18));
//        printLL(removeHead(head));
//        printLL(removeTail(head));
//        printLL(removeKthNode(head, 2));
//        printLL(removeVal(head, 21));
    }
}
