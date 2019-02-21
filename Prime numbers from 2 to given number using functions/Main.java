import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      prime(n);
	}
  
  public static void prime(int n)
  {
    boolean flag;
      for(int i=2;i<=n;i++)
      {
        flag = false;
         for(int j=2;j<i;j++)
         {
             if(i%j==0)
             {
                flag=true;
             }
         }
        
        if(flag==false)
        {
          System.out.println(i);
        }
      }
  }
}