import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int count;
      
      for(int i=n;i>=1;i--)
      {
         for(int j=i;j>=1;j--)
         {
           System.out.print(j);
         }
        
        System.out.print("\n");
      }
	}
}