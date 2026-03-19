package Core;

interface Base{
    void add(int a, int b);
    // bi default all methods are public and abstract we can give the body of method inside the interface!
    // void sub(int a, int b){
    //     System.out.println("Subtraction is: "+ (a-b));
    // }

    default void sub(int a, int b){
        System.out.println("Subtraction is: "+ (a-b));
    }
}

class Derived implements Base{
    public void add(int a, int b){
        System.out.println("Addition is: " + (a+b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction is: " + (a + b));
    }
}

public class OopsInterfaceAbstract4 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.add(4, 6);
        d.sub(9, 2);
    }    
}
