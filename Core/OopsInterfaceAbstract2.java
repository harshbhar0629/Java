package Core;

interface Base1 {
    void add(int a, int b);
    void sub(int a, int b);
};

interface Base2 {
    int mul(int a, int b);
    int div(int a, int b);
};

class Derived1 implements Base1 {
    public void add(int a, int b) {
        System.out.println("Defining interface method add in derived1 class");
        System.out.println("sum is: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Defining interface method sub in derived1 class");
        System.out.println("sum is: " + (a - b));
    }
}

class Derived2 implements Base2 {
    public int mul(int a, int b) {
        System.out.println("Defining interface method mul in derived2 class");
        return a*b;
    }

    public int div(int a, int b) {
        System.out.println("Defining interface method div in derived2 class");
        return a/b;
    }

}

class Derived3 implements Base1, Base2{
    public void add(int a, int b){
        System.out.println("Inside derived3 implementing add fn: \nsum is: "+ (a+b));
    }

    public void sub(int a, int b) {
        System.out.println("Inside derived3 implementing sub fn: \nsub is: " + (a - b));
    }

    public int mul(int a, int b) {
        System.out.println("Inside derived3 implementing mul fn: \nmul is: " + (a * b));
        return a*b;
    }

    public int div(int a, int b) {
        System.out.println("Inside derived3 implementing div fn: \ndiv is: " + (a / b));
        return a/b;
    }
}

public class OopsInterfaceAbstract2 {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        d1.add(3, 5);
        d1.sub(4, 2);

        Derived2 d2 = new Derived2();
        System.out.println("mul is: " + d2.mul(2, 4));
        System.out.println("div is: " + d2.div(4, 2));

        Derived3 d3 = new Derived3();
        d3.add(3, 5);
        d3.sub(5, 2);
        d3.mul(6, 9);
        d3.div(9, 3);
    }
}
