
import java.util.LinkedList;

public class DS06LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Insert Elements
        list.add(10); // add at end
        list.addFirst(5); // insert at beginning
        list.addLast(20); // insert at end
        list.add(2, 15); // insert at specific position

        System.out.println("Linked List: " + list);

        // Delete Elements
        list.removeFirst(); // delete from beginning
        list.removeLast(); // delete from end
        list.remove(1); // delete at position

        System.out.println("After Deletion: " + list);

        // Search Element
        if (list.contains(15)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        // Display Elements
        System.out.println("Traversing list:");
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
