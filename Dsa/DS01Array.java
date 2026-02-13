package Dsa;

import java.util.Scanner;

public class DS01Array {
    public static void handleArray() {
        System.out.println("Array start");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("default values of array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Values of array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Array End...");
        return;
    }

    static void handleString(){
        System.out.println("String start");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        int n;
        n = scanner.nextInt();
        String [] arr = new String[n];
        System.out.println("default values of String");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println("Values of String");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " " + arr[i].length());
        }

        System.out.println("");
        System.out.println("String End...");
    }

    public static void main(String[] args) {
        handleArray();
        handleString();
    }
}
