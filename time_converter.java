import java.util.Scanner;
public class time_converter
{
    public static void main(String[] args)
      {
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter the numbers of days : ");
	int days = scr.nextInt();
	/*int hours = days * 24;
	int minutes = hours * 60;
	int seconds = minutes * 60;*/
 	System.out.println(days * 24 * 60 * 60);	  
      }
}