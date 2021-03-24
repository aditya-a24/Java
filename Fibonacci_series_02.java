//Program to print fibonacci series(0, 1, 1, 2, 3, 5, 8, 13....) using recursion.

import java.util.*;

public class Fibonacci_series_02 {
    static int a = 0, b = 1, c = 0;

    static void printFibonacci(int n) {
        if (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            printFibonacci(n - 1);
        }
    }

    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print : ");
        int n = sc.nextInt();
        System.out.print(a + " " + b);
        printFibonacci(n - 2);
    }
}
