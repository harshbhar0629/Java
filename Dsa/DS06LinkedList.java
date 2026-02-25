
import java.util.LinkedList;

public class DS06LinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(11);
        l1.add(9);
        l1.add(2);
        l1.add(5);
        l1.addFirst(1);
        System.out.println(l1.get(2));
        System.out.println(l1.peek());
        System.out.println(l1);
        System.err.println(l1.peek());
    }
}
