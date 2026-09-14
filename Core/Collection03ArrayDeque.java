package Core;

import java.util.ArrayDeque;

public class Collection03ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(1);
        ad.addFirst(0);
        ad.addLast(3);
        ad.add(11);
        ad.addFirst(10);
        ad.addLast(13);
        ad.add(111);
        ad.addFirst(110);
        ad.addLast(113);
        System.out.println(ad);
        ad.removeFirstOccurrence(10);
        ad.removeLastOccurrence(13);
        System.out.println(ad);

        ad.remove(0); // remove element
        System.out.println(ad);
        ad.removeFirst(); // remove first element
        System.out.println(ad);
        ad.removeLast(); // remove last element
        System.out.println(ad);

    }
}
