import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int e = input.nextInt();
      int b = input.nextInt();
      int result;
      result = base(b,e);
      
      System.out.println(result);
	}
  
  public static int base(int b,int e)
  {
    int result=1;
     for(int i=0;i<b;i++)
     {
       result = result*e;   
     }
    
    return result;
  }
}