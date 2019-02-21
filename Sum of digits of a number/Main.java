import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      int result=0,count=0;
      
      while(number>0)
      {
         result = number%10;
         count = result+count;
         number = number/10;
      }
      System.out.println(count);
	}
}