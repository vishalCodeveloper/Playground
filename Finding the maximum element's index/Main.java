import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    int result;
    
    for(int i=0;i<arr.length;i++)
    {
       arr[i] = input.nextInt();
    }
    result = max(n,arr); 
    
    System.out.println(result);
  }
  
  public static int max(int n,int arr[])
  {
     int maxNumber=0,count=0;
     for(int i=0;i<arr.length;i++)
     {
        if(maxNumber<arr[i])
        {
          maxNumber = arr[i]; 
          count = i;
        }
     }
    
    return count;
  }
}