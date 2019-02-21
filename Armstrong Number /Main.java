import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int number=n;
      int count=0;
      int lastNumber=0;
      int result=0,result1=0;
      int number2=n;
      
      while(n>0)
      {
        lastNumber = n%10;
        n = n/10;
        count = count+1;
      }
      
      for(int i=1;i<=count;i++)
      {
         lastNumber = number%10;
         result =1;
        
          for(int j=1;j<=count;j++)
          {
              result = lastNumber*result;
          }
         number = number/10;
        result1 = result+result1;
      }
      
      if(result1==number2)
      {
        System.out.print("Armstrong Number");
      }
      else
      {
        System.out.print("Not a Armstrong Number");
      }
	}
}