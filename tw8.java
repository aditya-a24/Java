public class tw8
{
   public static void main(String args[])
     {
	  int sum = 0, total = 0, temp = 0;
	  for(int i = 0 ; i<args.length ; i++)
	     {
	        int n = Integer.parseInt(args[i]);
		if(n > 0)
		{total = total + n;}
	     }
	  while (total != 0)
  	     {
		temp = total % 10;
		sum = sum + temp;
 		total = total / 10;
	     }
	  System.out.println(sum);
     }
}
