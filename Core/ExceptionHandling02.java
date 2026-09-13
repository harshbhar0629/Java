package Core;

import java.util.Scanner;

class HandleException {
    void arithmeticExceptionError() throws ArithmeticException {
        try {
            int a = 6, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of b");
            b = sc.nextInt();
            System.out.println("Result of divisoion is: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error occured in arithmeticException");
            System.out.println("Error occurred due to the reason of: " + e.getMessage());
            throw e; // rethrowing the exception to be handled in the calling method
        }
        finally{
            System.out.println("End of arithmeticExceptionError method");
        }

    }

    public void arrayExceptionError() throws ArrayIndexOutOfBoundsException, NegativeArraySizeException {
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
    }
}

public class ExceptionHandling02 {
    public static void main(String[] args) {
        HandleException obj = new HandleException();
        // obj.arithmeticExceptionError(); // if any error occurs, then it will be abnormal termination of code but we
        System.out.println("Coonection established!");
        try{
            obj.arithmeticExceptionError();
        }catch(ArithmeticException e){
            System.out.println("Error occured in main method!");
            System.out.println("Error occurred due to the reason of: " + e.getMessage());
        }
    }
}
