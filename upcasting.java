class A { 
   String s = "Anand";
    void myMethod() 
    { 
        System.out.println("Parent"); 
    } 
} 
  
class B extends A { 
int n=7;
void myMethod() 
    { 
        System.out.println("Child"); 
    } 
}

class C extends B {
void myMethod()
{
System.out.println("Kiddo");
}
}
public class upcasting{

public static void main(String[] args)
{

C c = new C();
b.s="Aditya";
b.n=6;
System.out.println(b.s+b.n);
c.myMethod();
 }
} 