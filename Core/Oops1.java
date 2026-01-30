package Core;

class Dog{
    String name;
    int price;

    Dog(){
        name = "Gully Dog";
        price = 10;
    }

    Dog(String name, int price){
        this.name = name;
        this.price = price;
    }

    void bark(){
        System.out.println("Dog is barking");
    }

    int getPrice(){
        return price;
    }

    String getName(){
        return name;
    }
};

public class Oops1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.print("Dog name: ");
        System.out.println(d.getName());
        System.out.print("Dog Price is: ");
        System.out.println(d.getPrice());
        d.bark();
    }
}
