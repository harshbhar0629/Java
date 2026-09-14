package Core;

import java.util.Enumeration;
import java.util.Vector;

public class Collection06Enumeration {
    public static void main(String[] args) {
        // no type safety any type of data can be stored in the vector
        // Vector v = new Vector();
        // type safety
        Vector<Integer> v = new Vector<>(); // it automatically detects the type of data stored in the vector
        v.add(1901);
        v.add(1902);
        v.add(1903);
        v.add(1904);
        v.add(1905);

        System.out.println(v);
        System.out.println("Printing the vector elements using enumeration");
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
