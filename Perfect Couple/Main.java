import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int arr[] = new int[input.nextInt()];
      int sum;
      
      for(int i=0;i<arr.length;i++)
      {
         arr[i] = input.nextInt();
      }
      
      sum = input.nextInt();
      
      for(int i=0;i<arr.length-1;i++)
      {
         for(int j=i+1;j<arr.length;j++)
         {
           int sum1;
           
           sum1 = arr[j]+arr[i];
           
           if(sum1==sum)
           {
            System.out.println(arr[i]+", "+arr[j]);  
           }       
         }
      }
      
    }
}