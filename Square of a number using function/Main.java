import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int result;
      
      result = root(n);
      
      System.out.println(result);
	} 
  
  public static int root(int number)
  {
     number = number*number;
    return number;
  }
}