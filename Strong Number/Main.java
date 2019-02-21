import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner input = new Scanner(System.in);
      int n =input.nextInt();
      int lastNumber;
      int result=0,fact=1;
      int number = n;
      
      while(n>0)
      {
        lastNumber = n%10;
         for(int i=1;i<=lastNumber;i++)
         {
            fact = fact*i;
         }
        result = fact+result;
        n = n/10;
        fact=1;
      }
      if(result==number)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
	}
}
