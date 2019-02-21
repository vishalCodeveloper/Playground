import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    int result=0,result2=0;
   
    for(int i=0;i<arr.length;i++)
    {
       arr[i] = input.nextInt();
    }
    
    for(int i=0;i<arr.length;i++)
    {
       if(i==0||i==1||i==2)
       {
          result = result + arr[i];
       }
      
       else if(i==arr.length-1||i==arr.length-2||i==arr.length-3)
       {
           result2 = result2+ arr[i];
       }    
    }
    
    if(result==result2)
    {
       System.out.print("Perfect Batch");
    }
    else
    {
       System.out.print("Not a Perfect Batch"); 
    }
    
  }
}