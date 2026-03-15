
import java.util.Queue;

public class DS11Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(10);
        q.add(11);
        System.out.println(q.peek());
        int a = q.remove();
        System.out.println(q.poll());
        q.add(111);
        q.add(123);
        System.out.println(q);
    }
}
