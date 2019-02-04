package series;

import java.util.Scanner;

class Prime
{
   public static void main(String args[])
   {
      int n, k=1, num = 2, count;
 
     /* Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of prime numbers you want: ");
      n = in.nextInt();
 
      for (count = 2; count <=n;)
		  */
	  for(int i=2; i<=100;i++)           //( only use this loop if we are print between 1-100 prime no)
      {
         for (int j = 2; j <=num/2; j++)
         {
            if (num%j == 0)
            {
               k= 0;
               break;
            }
         }
         if (k != 0)
         {
            System.out.println(num);
            //count++;
         }
         k = 1;
         num++;
      }        
   }
}