package Core;

class A {
    void show() {
        System.out.println("A class show fn");
    }

    void show1() {
        System.out.println("A class show fn is extending");
    }
}

public class OopsLamdaExp02 {
    public static void main(String[] args) {
        // A obj = new A() { // anonymous class and we are extending the class A prop
        //     void show() {
        //         System.out.println("explicit show fn");
        //     }
        // };
        A obj = new A() { // anonymous class and we are extending the class A prop
            void show() {
                System.out.println("explicit show fn");
            }
            void print(){
                System.out.println("Printing the data");
            }
        };


        obj.show();
        obj.show1();
        obj.show();

    }
}
