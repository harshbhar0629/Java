package Core;

import java.util.Scanner;

class LearnException {
    void arithmeticExceptionError() {
        try {
            int a = 6, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of b");
            b = sc.nextInt();
            System.out.println("Result of divisoion is: "+a / b);

        } catch (ArithmeticException e) { // all arithmetic exceptions will be handled here..
            System.out.println("Arithmetic error occured: " + e.getMessage());
        } catch (Exception e) { // default exception handler
            System.out.println("Error occured due to the reason of: " + e.getMessage());
        }
    }

    public void arrayExceptionError() {
        try {
            int size;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            size = sc.nextInt();
            int arr[] = new int[size];
            int idx;
            System.out.println("Enter the index of array");
            idx = sc.nextInt();
            System.out.println("Enter the value of index: " + idx);
            arr[idx] = sc.nextInt();
            System.out.println("Value stored in array at index " + idx + " is: " + arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException error occurred: " + e.getMessage());
        }
        catch(NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error occurred due to the reason of: " + e.getMessage());
        }
    }
}

public class ExceptionHandling01 {

    public static void main(String[] args) {
        System.out.println("Connection stablished:");
        LearnException obj = new LearnException();
        obj.arithmeticExceptionError(); // if any error occurs, then it will be abnormal termination of code but we
   
        // handling it using try catch block..
        obj.arrayExceptionError();

        System.out.println("Connection terminated:");
    }
}
