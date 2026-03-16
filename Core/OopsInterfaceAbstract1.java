package Core;

interface Base{
    void add(int a, int b);
    void sub(int a, int b);
};

class Derived1 implements Base{
    public void add(int a, int b){
        System.out.println("Defining interface method add in derived1 class");
        System.out.println("sum is: " + (a+b));
    }

    public void sub(int a, int b) {
        System.out.println("Defining interface method sub in derived1 class");
        System.out.println("sum is: " + (a-b));
    }
}

class Derived2 implements Base{
    public void add(int a, int b) {
        System.out.println("Defining interface method add in derived2 class");
        System.out.println("sum is: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Defining interface method sub in derived2 class");
        System.out.println("sum is: " + (a - b));
    }

}

public class OopsInterfaceAbstract1 {
    public static void main(String[] args) {
        Base obj1 = new Derived1();
        obj1.add(1, 2);
        obj1.sub(2, 4);

        Base obj2 = new Derived2();
        obj2.add(3, 4);
        obj2.sub(5, 2);
    }
}
