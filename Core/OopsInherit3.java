package Core;
// learn about acess specifier
// private member/method access by only class
// protected member/method can access by child class or within class
// public member/method can access by all either child or object of child class or own object 
// using super keyword we can access the instance variable of immediate parent of child class

class parent{
    private String name;
    int val;
    parent(){
        val = 1;
        this.name = "Parent name";
    }

    public void show(){
        System.out.println("Parent name: " + name);
    }

    protected void upadteName(String name){
        this.name =  name;
    }
}

class Child extends parent{
    String name;
    Child(){}
    void update(String name){
        upadteName(name);
    }
    void showAll(){
        System.out.print("val : "+super.val);
    }
}

public class OopsInherit3 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.update("Child name updated");
        c.show();
    }
}