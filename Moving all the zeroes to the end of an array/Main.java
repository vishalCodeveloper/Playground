import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int arr[] = new int[input.nextInt()];
      int temp[];
      int tempCount=0;
      
      for(int i=0;i<arr.length;i++)
      {
        arr[i] = input.nextInt();
      }
      
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i]!=0)
         {
            tempCount=++tempCount;
         }
      }
      temp = new int[tempCount];
      tempCount=0;
      
     for(int i=0;i<arr.length;i++)
      {
         if(arr[i]!=0)
         {
           temp[tempCount] = arr[i];
           tempCount++;
         }
      } 
      for(int i=0;i<arr.length;i++)
      {
         if(i<tempCount)
         {
            arr[i]=temp[i];
         }
        else
        {
           arr[i] = 0;
        }
      }
      
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
}