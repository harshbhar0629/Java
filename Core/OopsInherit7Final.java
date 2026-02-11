package Core;

// if we append final keyword to any class and then after that class will not participated in inheritance!

// final class Parent{
//     void show(){
//         System.out.println("Parent show!");
//     }
// };

// if we append the final keyword in method then it can participate in inheritance
class parent{
    // reassignment of final varibale is not allowed in java it behave like a constant in java
    final int age = 10;

    final void show(){
        // age = 20;
        System.out.println("parent show! with the age of -> " + age);
    }
}

class child extends parent{
    // we can't override the method which is decleared in parent class as final method
    // void show(){
    //     System.out.println("child show!");
    // }
};

public class OopsInherit7Final {
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }   
}
