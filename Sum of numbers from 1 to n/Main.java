import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner input = new Scanner(System.in);
      int n,result=0;
      n = input.nextInt();
      
      for(int i=1;i<=n;i++)
      {
         result = result + i;
      }
      
      System.out.println(result);
	}
}