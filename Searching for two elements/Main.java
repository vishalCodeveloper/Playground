import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int arr[] = new int[input.nextInt()];
      boolean flag1=false,flag2=false;
      
      for(int i=0;i<arr.length;i++)
      {
         arr[i] = input.nextInt();
      }
      
    int elem1=input.nextInt(),elem2=input.nextInt();
      
      for(int i=0;i<arr.length;i++)
      {
          if(elem1==arr[i])
          {
            elem1 = i;
            flag1 = true;
          }
        if(elem2==arr[i])
        {
          elem2 = i;
          flag2 = true;
        }
      }
      
      if(flag1==false)
      {
              System.out.println("-1");
      }
      else
      {
              System.out.println(elem1);

      }
      
      if(flag2==false)
      {
              System.out.println("-1");

      }
      else
      {
              System.out.println(elem2);

      }
      
    }
}