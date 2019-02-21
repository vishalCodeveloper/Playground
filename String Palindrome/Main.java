import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    String s=input.next();
    String reverse="";
      
    for(int i=s.length()-1;i>=0;i--)
    {
      reverse = reverse+s.charAt(i);   
    }
      
      if(reverse.equals(s))
  {
    System.out.print("Yes");
  }
  
  else
  {
    System.out.print("No");
  }
    }
}