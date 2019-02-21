import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      int result;
      
      result = sum(n);
      
      System.out.println(result);
	}
  
  public static int sum(int number)
  {
     number = number*(number+1)/2;
    return number;
  }
}