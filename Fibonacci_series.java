//Program to print fibonacci series(0, 1, 1, 2, 3, 5, 8, 13....) using loop

import java.util.*;

public class Fibonacci_series {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print : ");
        int n = sc.nextInt();
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        printFibonacci(n - 2);
    }
}
