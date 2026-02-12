package Core;

class Aeroplane {
    public void landing() {
        System.out.println("Aeroplane is landing!");
    }

    public void takingOff() {
        System.out.println("Aeroplane is taking off");
    }
}

class CargoPlane extends Aeroplane {
    public void landing() {
        System.out.println("CargoPlane is landing!");
    }

    public void fly() {
        System.out.println("CargoPlane is flying!");
    }
}

class FighterPlane extends Aeroplane {
    public void landing() {
        System.out.println("FighterPlane is landing!");
    }

    public void fly() {
        System.out.println("FighterPlane is flying!");
    }
}

public class OopsPoly1 {
    public static void main(String[] args) {
        // methods depends on object type
        Aeroplane cp = new CargoPlane(); // upcasting
        cp.landing();
        cp.takingOff();
        // cp.fly();
        // ref type is parent and object type is child then we can not access object type methods directly
        ((CargoPlane) cp).fly(); // downcasting

        System.out.println("");

        Aeroplane fp = new FighterPlane();
        fp.landing();
        fp.takingOff();
        ((FighterPlane) fp).fly();
        // ((CargoPlane) fp).fly(); error not allowed
    }
}
