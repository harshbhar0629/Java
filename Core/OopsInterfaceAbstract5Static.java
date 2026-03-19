package Core;

interface Base{
    void add(int a, int b);

    // static methods needs body 
    static void sub(int a, int b){
        System.out.println("Subtraction is: "+ (a-b));
    }
}

class Derived implements Base{
    public void add(int a, int b){
        System.out.println("Addition is: " + (a+b));
    }
}

public class OopsInterfaceAbstract5Static {
    public static void main(String[] args) {
        Derived d = new Derived();
        // d.sub(2, 4); // not inherited
        // Base.sub(3, 56);

        Base b = new Derived();
        b.sub(3,4);
    }
}
