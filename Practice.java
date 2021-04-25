/*
//Hello World.
public class Practice {
    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}
*/

/*
//Variables.
public class Practice {
    int a = 24; // instance variable

    static int b = 25; // static variable

    static void Method() {
        int c = 26; // local variable
        System.out.println(c);
    }

    public static void main(String args[]) {
        Practice p = new Practice(); //for instance variable, we create object of class practice
        System.out.println(p.a);
        System.out.println(b);
        Method();
    }
}
*/

/*
// Java Type Casting
public class Practice {
    public static void main(String args[]) {
        int a = 24;
        float b = a; // widening typeCasting(automatically)
        double c = 25.5;
        int d = (int) c; // narrowing typeCasting(manually)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
*/

/*
// Getting User Input
import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = sc.nextInt(); // Taking input from user
        System.out.println("you entered " + a);
    }
}
*/

/*
// Java Loop
public class Practice {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) { // for loop
            System.out.println(i);
        }

        int a = 0;
        while (a <= 10) { // while loop
            System.out.println(a);
            a++;
        }

        int b[] = { 1, 2, 3, 4, 5 };
        for (int i : b) { // for each loop
            System.out.println(i);
        }
    }
}
*/

// Class and Objects in Java
/*
// main within the class
class Practice {
    String name = "Adi";
    int roll = 07;

    public static void main(String args[]) {
        Practice p = new Practice(); // creating an object
        System.out.println(p.name + " " + p.roll);
    }
}
*/

/*
// main outside the class
class Practice1 {
    String name = "Adi";
    int roll = 07;
}

class Practice {
    public static void main(String args[]) {
        Practice1 p1 = new Practice1(); // creating an object
        System.out.println(p1.name + " " + p1.roll);
    }
}
*/

/*
// Object Initialization through reference
class Practice1 {
    String name;
    int roll;
}

class Practice {
    public static void main(String args[]) {
        Practice1 p1 = new Practice1(); // creating an object
        p1.name = "Aditya"; // Initializing objects
        p1.roll = 07; // Initializing objects
        System.out.println(p1.name + " " + p1.roll);
    }
}
*/

//Object Initialization through method
class Practice1 {
    String name;
    int roll;

    void method(String n, int r) {
        name = n; // Initializing objects
        roll = r; // Initializing objects
        System.out.println(name + " " + roll);
    }
}

class Practice {
    public static void main(String args[]) {
        Practice1 p1 = new Practice1(); // creating an object
        p1.method("Aditya", 07);
    }
}