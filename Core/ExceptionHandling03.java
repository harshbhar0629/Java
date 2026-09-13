package Core;
import java.util.Scanner;

class HandleException01 {
    int arithmeticExceptionError()  {
        try {
            int a = 6, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of b");
            b = sc.nextInt();
            System.out.println("Result of divisoion is: " + a / b);
            return 11;
        } catch (ArithmeticException e) {
            System.out.println("Error occurred due to the reason of: " + e.getMessage());
        } finally {
            System.out.println("End of arithmeticExceptionError method");
            return 10;
        }

    }
}

// if parent throws an unchecked exception, and child throws a checked exception then it will give compile time error. 
// But if parent throws a checked exception and child throws an unchecked exception then it will not give any compile time error.
// if parent throws a checked exception, and child throws a partial checked exception then it will give compile time error. 
// But if parent throws a checked exception and child throws a unchecked exception then it will not give any compile time error.

public class ExceptionHandling03 {
    public static void main(String[] args) {   
        HandleException01 obj = new HandleException01();
        System.out.println(obj.arithmeticExceptionError());
    }
}
