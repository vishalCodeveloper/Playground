import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int number=input.nextInt();
      int count=0,firstNumber=0,lastNumber,result;

     lastNumber = number%10;

     while(number>0)
     {
       firstNumber = number%10;
       number = number/10;
       count = count+1;
     }

     result = firstNumber+lastNumber;

     System.out.println(result);	}
}