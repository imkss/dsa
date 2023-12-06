package _Frameworks;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class D_Priority_Queue {
    public static void main(String[] args) {

        Queue<Integer> MinHeap = new PriorityQueue<>();
        MinHeap.offer(45);
        MinHeap.offer(32);
        MinHeap.offer(15);
        MinHeap.offer(39);
        MinHeap.offer(92);
        MinHeap.offer(89);
        MinHeap.offer(17);
        System.out.println(MinHeap);
        MinHeap.poll();
        System.out.println(MinHeap);
        System.out.println(MinHeap.peek());

        Queue<Integer> MaxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        MaxHeap.offer(45);
        MaxHeap.offer(32);
        MaxHeap.offer(15);
        MaxHeap.offer(39);
        MaxHeap.offer(92);
        MaxHeap.offer(89);
        MaxHeap.offer(17);
        System.out.println(MaxHeap);
        MaxHeap.poll();
        System.out.println(MaxHeap);
        System.out.println(MaxHeap.peek());
    }
}