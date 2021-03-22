import java.util.*;

public class tw1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any three numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max, min;
        /*
         * if (a > b && a > c) { System.out.println(a + " is maximum number"); } else if
         * (b > a && b > c) { System.out.println(b + " is maximum number"); } else {
         * System.out.println(c + " is maximum number"); }
         * 
         * if (a < b && a < c) { System.out.println(a + " is minimum number"); } else if
         * (b < a && b < c) { System.out.println(b + " is minimum number"); } else {
         * System.out.println(c + " is minimum number"); }
         */
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max + " is maximum number");

        min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(min + " is minimum number");
    }
}