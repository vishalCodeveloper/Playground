import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int count=1;
      
      for(int i=1;i<=n;i++)
      {
         for(int j=n;j>i;j--)
         {
            System.out.print(" ");
         }
        
         for(int k=1;k<=count;k++)
         {
           System.out.print("*");
         }
        System.out.print("\n");
        count = count+2;
      }
      
	}
}