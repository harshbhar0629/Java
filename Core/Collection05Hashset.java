package Core;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection05Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1901);
        hs.add(1902);
        hs.add(1903);
        hs.add(1904);
        hs.add(1905);
        hs.add(1903);
        hs.add(1904);
        hs.add(1905); // only unique values stored
        hs.add(2);
        System.out.println(hs);
        System.out.println(hs.contains(1));
        System.out.println(hs.contains(2));
        // hs.hashCode();
        System.out.println(hs.remove(1));
        System.out.println(hs.remove(2));

        for (Integer i : hs) {
            System.out.println(i);
        }

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(1901);
        lhs.add(1904);
        lhs.add(1902);
        lhs.add(1903);
        lhs.add(1905);
        lhs.add(1903);
        lhs.add(1904);
        lhs.add(1905); // only unique values stored
        lhs.remove(1901);

        System.out.println(lhs);
    }   
}
