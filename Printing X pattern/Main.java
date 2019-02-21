import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
       int n = input.nextInt();;
      int count=1;
      int temp=(n-2);
      
      for(int i=1;i<=n;i++)
      {
          if(i<=(n/2)+1) 
          {
             for(int j=1;j<count;j++)
             {
               System.out.print(" ");
             }
              count=count+1;
          } 

          else
          {
             for(int k=count-2;k>1;k--)
             {
              System.out.print(" ");
             }

             count = count-1;
          }

            System.out.print("*");

          if(i!=(n/2)+1)
          {
             if(i<=(n/2)+1)
             {
                   for(int j=1;j<=temp;j++)
                   {
                     System.out.print(" ");
                   }

                   temp = temp-2;
             }
             else
             {
               temp = temp+2;

                for(int j=temp;j>=1;j--)
                   {
                     System.out.print(" ");
                   }

             }

          }

          if(i!=(n/2)+1)
          {
            System.out.print("*");
          }



         System.out.print("\n");
      } 
	}
}