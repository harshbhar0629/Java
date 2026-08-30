package Core;

abstract class A{
    abstract void show();
}

interface B {
    void show();
}

public class OopsLamdaExp03InterAbst {
    public static void main(String[] args) {
        A obj = new A() {
            void show(){
                System.out.println("In show");
            }
        };

        obj.show();

        B obj1 = new B() {
            public void show() {
                System.out.println("In show");
            }
        };

        obj1.show();

        // A obj2 = () -> System.out.println("in showing");
        // obj2.show(); // error in abstract

        B obj2 = () -> System.out.println("in showing");
        obj2.show();
    }
}
