import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n =in.nextInt();
     boolean b=true;

    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=i;j++)
       {

             if(b==true)
             {
               System.out.print("*");
               b = false;
             }
             else
             {
               System.out.print("#");
               b = true;
             }
       }

       System.out.print("\n");
    }    }
}