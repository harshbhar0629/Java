class A {

    int x = 10;

    A() {
        System.out.println("A Constructor");
        show();
    }

    void show() {
        System.out.println("A Show: " + x);
    }
}

class B extends A {

    int x = 20;

    B() {
        System.out.println("B Constructor");
        show();
    }

    @Override
    void show() {
        System.out.println("B Show: " + x);
        System.out.println("Super X: " + super.x);
    }
}

public class ques1 {
    public static void main(String[] args) {
        A obj = new B();

        System.out.println("Main");

        obj.show();
    }
}
