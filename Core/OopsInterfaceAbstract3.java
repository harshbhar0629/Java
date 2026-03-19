package Core;

interface Base{
    void add(int a, int b);
}

// interface can not implments another interface
// interface Base2 implements Base{
//     int a = 2; // bidefault all the fields inside the interface declared as final or static we can't reassigned the value of any variable
//     void sub(int a, int b);
// }

// interface can extends another interface!
interface Base2 extends Base{
    void sub(int a, int b);
}

class Derived implements Base2{
    public void add(int a, int b){
        System.out.println("Addition is: " + (a+b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction is: " + (a - b));
    }
}

public class OopsInterfaceAbstract3 {
    public static void main(String[] args) {
        
    }
}
