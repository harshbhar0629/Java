package Core;
import java.util.Scanner;

public class Basic3 {
    static void triangle(int n){
        System.out.println("Triangle Pattern:");
        for(int i=1; i<=n; i++){
            for(int j=1; j<2*n; j++){
                if(j>=n+1-i && j<=n-1+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void rectangle(int n){
        System.out.println("Rectangle Pattern:");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void square(int n){
        System.out.println("Square Pattern:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void emptySquare(int n){
        System.out.println("Square Pattern:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void emptyRectangle(int n){
        System.out.println("Square Pattern:");
        for(int i=0; i<n; i++){
            for(int j=0; j<2*n; j++){
                if(i==0 || i==n-1 || j==0 || j==2*n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        // fn call 
        triangle(n);
        rectangle(n);
        square(n);
        emptySquare(n);
        emptyRectangle(n);

    }    
}
