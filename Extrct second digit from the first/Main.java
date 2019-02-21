import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int number=input.nextInt();
       int count=0,n=number,result=1;

     while(number>0)
     {
       number = number/10;
       count = count+1;
     }

     while(count-2>0)
     {
       result = result*10;
       count = count-1;  
     }
     result = n/result%10;
    System.out.println(result);
    }
}