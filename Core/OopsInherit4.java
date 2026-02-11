package Core;

// visibility of fn inside the class
class Parent{
    String name;
    Parent(){
        this.name = "Parent name";
    }

    public void show(){
        System.out.println(name);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child cons called!");
    }

    // not allowed
    // void show(){
    //     System.out.println("child name");
    // }
    
    // not allowed of different types of same fn 
    // private  void show(){
    //     System.out.println("child name");
    // }

    public void show(){
        System.out.println("Show child wala!");
    }
}

public class OopsInherit4 {
    public static void main(String[] args) {
        System.out.println("Main call");   
    }
}
