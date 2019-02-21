import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      int result;
      
      greatest(n1,n2,n3);
	}
  
   public static void greatest(int n1, int n2, int n3)
   {
       if(n1>n2)
       {
         if(n1>n3)
        {
          System.out.println(n1);
        }
       else
       {
          System.out.println(n3);

       }
         
       }
     else 
     {
        if(n2>n3)
        {
           System.out.println(n2);
        }
       else
       {
           System.out.println(n3);
       }
     }
   }
}