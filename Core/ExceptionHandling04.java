package Core;

class InvalidCustomerException extends Exception {
    InvalidCustomerException(String msg) {
        super(msg);
    }
}

class Customer {
    int age;

    Customer(int age) {
        this.age = age;
    }

    void checkCustomerAge() throws InvalidCustomerException {
        if (age < 18) {
            throw new InvalidCustomerException("Age is below 18, You can't open an Account");
        } else {
            System.out.println("Valid Customer");
        }
    }
}

class Bank {
    void verifyCustomerAge() {
        try {
            Customer customer = new Customer(15);
            customer.checkCustomerAge();
        } catch (InvalidCustomerException e) {
            System.out.println(e);
        }
    }
}

public class ExceptionHandling04 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.verifyCustomerAge();
    }
}
