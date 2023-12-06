package _Frameworks;

import java.util.LinkedList;
import java.util.Queue;

public class C_LinkedList_Queue {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>(); //FIFO
        num.offer(45);
        num.offer(32);
        num.offer(89);
        System.out.println(num);
        System.out.println(num.poll());
        System.out.println(num.peek());
        System.out.println(num.contains(3));
        System.out.println(num.size());
    }
}