package _Frameworks;

import java.util.ArrayDeque;

public class E_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offerFirst(15);
        adq.offerLast(45);
        adq.offer(23);
        adq.offer(33);
        adq.offerFirst(10);

        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.peek());

        System.out.println(adq.pollLast());
        System.out.println(adq.pollFirst());
        System.out.println(adq.poll());
        System.out.println(adq.contains(1));
        System.out.println(adq);

    }
}