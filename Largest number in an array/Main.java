import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int arr[] = new int[input.nextInt()];
       int largeNumber = 0;
      
      for(int i=0;i<arr.length;i++)
      {
         arr[i] = input.nextInt();
      }
      
      for(int i=0;i<arr.length;i++)
      {
         if(largeNumber<arr[i])
         {
            largeNumber = arr[i];
         }
      }
      
      System.out.print(largeNumber);
    }
}