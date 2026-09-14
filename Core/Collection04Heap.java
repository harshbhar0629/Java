package Core;

import java.util.PriorityQueue;

public class Collection04Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1901);
        pq.clear(); // remove all element
        pq.add(1902);
        pq.add(1903);
        pq.add(1904);
        pq.add(1905);
        pq.add(1906);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.peek()); // it will return the head of the queue
        System.out.println(pq.poll()); // it will return the head of the queue and remove
        System.out.println(pq);
        System.out.println(pq.size());
        System.out.println(pq.contains(1903));
    }
}
