
import java.util.Stack;

public class DS10Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.add(2);
        st.push(1);
        st.add(2, 3);
        System.out.println("before ");
        for (int i : st) {
            System.out.println(i);
        }

        System.out.println("After");
        st.pop();
        // st.addElement(2);
        st.addFirst(11111);
        st.addLast(1111);
        
        for (int i : st) {
            System.out.println(i);
        }

        System.out.println(st.contains(12));
        int removed = st.pop();
        System.out.println("Removed: " + removed);
        System.out.println(st.peek());
    }   
}
