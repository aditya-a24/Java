import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int no = sc.nextInt();
        int s = 0;
        int r;
        int temp = no;
        while (no > 0) {
            r = no % 10;
            s = s * 10 + r;
            no = no / 10;
        }
        if (s == temp) {
            System.out.println(temp + " is a palindrome number");
        } else
            System.out.println(temp + " is not a palindrome number");
    }
}
