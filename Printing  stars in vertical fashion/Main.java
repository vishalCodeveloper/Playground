import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    
    for(int i=1;i<=number;i++)
    {
      System.out.println("*");
    }
  }
}