package Core;

abstract class Aeroplane {

    public Aeroplane() {
        System.out.println("Aero cons called!");
    }
    
    public abstract void landing();

    public abstract void takingOff() ;

    public void sayHello(){
        System.out.println("Hello Aeroplane");
    }
}

// if child class donot give the body of abstract fn which declared in parent class as a abstract method then child class must be abstract class otherwise it will give you error! 
class CargoPlane extends Aeroplane {
    public void landing() {
        System.out.println("CargoPlane is landing!");
    }

    public void takingOff(){
        System.out.println("Cargoplane is taking off..");
    }

    public void fly() {
        System.out.println("CargoPlane is flying!");
    }
    
    public void sayHello() {
        System.out.println("Hello CargoPlane");
    }
}

class FighterPlane extends Aeroplane {
    public void landing() {
        System.out.println("FighterPlane is landing!");
    }

    public void takingOff() {
        System.out.println("FighterPlane is taking off..");
    }

    public void fly() {
        System.out.println("FighterPlane is flying!");
    }
    
    public void sayHello() {
        System.out.println("Hello FighterPlane");
    }
}

public class OopsQAbstract1 {
    public static void main(String[] args) {
        // System.out.println("hii");
        // Aeroplane a = new Aeroplane(); // object of abstract class is not initiated!
   
        // CargoPlane cp = new CargoPlane();
        Aeroplane cp = new CargoPlane();
        cp.sayHello();
        cp.landing();
        cp.takingOff();
   
    }   
}
