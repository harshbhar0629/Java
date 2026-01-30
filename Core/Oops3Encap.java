package Core;

class Book{

   private int price;
   private String name;
   private int pageNo;

    Book(int price, int pageNo, String name){
        this.name = name;
        this.price = price;
        this.pageNo = pageNo;
    }

    void setValue(int price, int pageNo, String name){
        this.name = name;
        this.price = price;
        this.pageNo = pageNo;   
    }

    void display(){
        System.out.println("Book Name: "+ this.name + "\nBook Price: " + this.price + "\nTotal Pages: " + this.pageNo);
    }
}

public class Oops3Encap {
    public static void main(String[] args) {
        Book b = new Book(10, 198, "Magical");
        // System.out.println(b.name); private member can't access
        b.display();
    }
}
