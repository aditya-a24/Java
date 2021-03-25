//Program to check whether a number is prime or not.

import java.util.*;

class Prime_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int i;
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (i = 2; i < n - 1; i++) {
                if (n % i == 0)
                    flag = 1;
                break;
            }
            if (flag == 0)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number");
        }
    }
}