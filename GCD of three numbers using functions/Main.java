import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner input = new Scanner(System.in);
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      int result;
      
      result = gcd(n1,n2,n3);
	}
  
   public static int gcd(int n1, int n2, int n3)
   {
     int s=0;
       if(n1<n2)
       {
          if(n1<n3)
          {
            s = n1;
          }
         else 
         {
           s=n3;
         }
       }
     
     else 
     {
        if(n2<n3)
          {
           s= n2;
          }
         else 
         {
            s = n3;
         }
     }
     
     
     
     System.out.println(s);
       return 5;
   }
}