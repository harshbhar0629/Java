package Core;

/**
 * static variable belongs to the class not every object 
 * static{} when we use to init static blocks it runs only once when class is loaded 
 * memory efficient shared by all objects 
 * constructor is not used to init static variable because cons called every time when object is created!
 * 
 * internally jvm mapped 
 * static -> class level
 * non static -> object level
 * static member stored one copy per class 
 * 
 * static internally do not have no object address thats why this keyword is also not work in static fn
 */

class Demo{
    static int a, b, c;
    static{
        System.out.println("Static vairable init:)");
        a = 10;
        b = 20;
        c = 30;
    }

    // multiple static block can execute
    static{
        System.out.println("static 2");
    }

    static void display(){
        System.out.println("Static varibale displaying:)");
        System.out.println("a: " + a + ", b: "+b +", c: "+c);
    }

    static void increment(){
        System.out.println("Static varibale increment");
        a++;
        b++;
        c++;
    }
}

public class Oops5Static {
    public static void main(String[] args) {
        Demo.display();
        Demo.increment();
        Demo.display();
    }
}
