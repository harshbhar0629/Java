package Core;

import java.util.LinkedList;

class LinkedListCollection{
    // void LinkedListImplementation(){
    //     // it generates warning because we are not using generics, so it is not type safe
    //     LinkedList ll = new LinkedList(); // multitype data stored because it stored the value in object class
    //     ll.add(1901);
    //     ll.add(1902);
    //     ll.add("ll");
    //     ll.add(true);
    //     System.out.println(ll);
    // }

    void LinkedListImplementationWithGenerics(){
        LinkedList<Integer> ll = new LinkedList<Integer>(); // it is type safe because we are using generics
        ll.add(1901);
        ll.add(1902);
        // ll.add("ll"); // it will give compile time error because we are using generics
        // ll.add(true); // it will give compile time error because we are using generics

        System.out.println(ll);

        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("hey");
        ll1.add("world");
        System.out.println(ll1);
    }

    void LinkedListPlayingWithIndex(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1901);
        ll.add(1902);
        ll.add(1903);
        ll.add(1904);
        ll.add(1905);
        ll.addFirst(1);
        ll.addLast(2);
        ll.offer(12); // adds the specified element as the tail (last element) of this list
        ll.offerFirst(1111); // inserts the specified element at the front of this list
        ll.offerLast(2222); // inserts the specified element at the end of this list

        System.out.println(ll);
        
        // adding element at specific index
        ll.add(2, 100);
        System.out.println(ll);

        ll.remove(1); // removing element at specific index
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.pollFirst(); // retrieves and removes the first element of this list, or returns null if this list is empty.
        System.out.println(ll);
        ll.pollLast(); // retrieves and removes the last element of this list, or returns null if this list is empty.
        System.out.println(ll);

        System.out.println(ll.indexOf(1903)); // it will return the index of the element

        System.out.println(ll.toString());
        // System.out.println(ll.remove(1000)); // it will return false because the element is not present in the list
        System.out.println(ll.contains(100));
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll2.add(100);
        ll2.add(1903);
        System.out.println(ll2.peek());
        System.out.println(ll2.peekLast());
        System.out.println(ll2.peekFirst());
        System.out.println(ll.containsAll(ll2)); // it will return false because the element is not present in the list
    }

}

public class Collection02LinkedList {
    public static void main(String[] args) {
        LinkedListCollection ll = new LinkedListCollection();
        // ll.LinkedListImplementation(); // compile time error
        ll.LinkedListImplementationWithGenerics();
        ll.LinkedListPlayingWithIndex();
    }
}
