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

public class OopsPoly2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        Aeroplane a;
        a = cp;
        a.landing();
        a.takingOff();
        System.out.println("************************");  
        a = fp;
        a.landing();
        a.takingOff(); 

        // 1:Many one object can change multiple times their type of object!
    }
}
