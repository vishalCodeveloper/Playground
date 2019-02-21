import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      char ch = input.next().charAt(0);
      int key = input.nextInt();
      
      if(ch>=97&&ch<=122)
      {
              ch = (char) (ch+26-key);

      }
      
      else
      {
                       ch = (char) (ch-key);

      }
      
      System.out.print(ch);
      
    }
}