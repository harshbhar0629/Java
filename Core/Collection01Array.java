package Core;

import java.util.ArrayList;

class Array{
    // it generates warning because we are not using generics, so it is not type safe
    // void ArrayListImplementation(){
    //     ArrayList al = new ArrayList(); // multitype data stored because it stored the value in object class
    //     al.add(1901);
    //     al.add(1902);
    //     al.add("al");
    //     al.add(true);

    //     System.out.println(al);

    // }

    void ArrayListImplementationWithGenerics(){
        ArrayList<Integer> al = new ArrayList<Integer>(); // it is type safe because we are using generics
        al.add(1901);
        al.add(1902);
        // al.add("al"); // it will give compile time error because we are using generics
        // al.add(true); // it will give compile time error because we are using generics

        System.out.println(al);

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("hey");
        al1.add("world");
        System.out.println(al1);
    }

    void ArrayListPlayingWithIndex(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1901);
        al.add(1902);
        al.add(1903);
        al.add(1904);
        al.add(1905);

        System.out.println(al);
        
        // adding element at specific index
        al.add(2, 100);
        System.out.println(al);

        al.remove(1); // removing element at specific index
        System.out.println(al);

        al.addFirst(1);
        System.out.println(al);
        System.out.println(al.indexOf(1903)); // it will return the index of the element

        System.out.println(al.toString());
        // System.out.println(al.remove(1000)); // it will return false because the element is not present in the list
        System.out.println(al.contains(100));
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(100);
        al2.add(1913);
        System.out.println(al.containsAll(al2)); // it will return false because the element is not present in the list
    }

}

public class Collection01Array {
    public static void main(String[] args) {
        Array array = new Array();
        // array.ArrayListImplementation();
        System.out.println("ArrayList Implementation with Generics");
        array.ArrayListImplementationWithGenerics();
        System.out.println("");
        System.out.println("");
        System.out.println("ArrayList Playing with Index");
        array.ArrayListPlayingWithIndex();
    }
}
