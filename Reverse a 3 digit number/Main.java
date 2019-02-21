import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int number=input.nextInt();
    int firstDigit,secondDigit,lastDigit,reverseNumber;

    firstDigit=number/100;
    secondDigit = (number/10)%10;
    lastDigit = number%10;

    reverseNumber = lastDigit*10+secondDigit;
    reverseNumber = reverseNumber*10+firstDigit;

    System.out.println(reverseNumber);  }
}