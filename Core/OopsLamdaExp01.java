package Core;

class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Person name is: " + this.name);
    }

    // static class Phone {
    //     int price;
    //     String name;

    //     void printDetails() {
    //         System.out.println("Phone name is: " + this.price + " and its price is: " + this.price);
    //     }
    // }

    class Phone {
        int price;
        String name;

        void printDetails() {
            System.out.println("Phone name is: " + this.price + " and its price is: " + this.price);
        }

        static void printDetails1() {
            System.out.println("Phone name is: "  + " and its price is: " );
        }
    }
}

public class OopsLamdaExp01 {
    public static void main(String[] args) {
        Person p = new Person("harsh");
        p.printName();
        // Person$Phone pp = new Phone();
        // Person.Phone p1 = new Person.Phone(); // make phone class as static for creating the object otherwise it will not work anymore
        // p1.printDetails();

        // if inner class is non static then above class or parent class object is used to create an object. 
        Person.Phone p1 = p.new Phone();
        // Person.Phone p2 = new p().Phone();
        p1.printDetails();
        Person.Phone.printDetails1();

    }
}
