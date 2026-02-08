package Core;

class Parent{
    int age;
    void disp(){
        age = 10;
        System.out.println("Age: " + age);
    }
};
class Child extends Parent{

};

public class OopsInherit1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.disp();
    }
}
