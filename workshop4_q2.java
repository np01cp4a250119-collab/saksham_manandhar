import java.util.Scanner;

public class workshop4_q2
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "enter number:");
      int num =scanner.nextInt();
       
       if(num % 2==0){
               System.out.println("its even");
           }
      else{
          System.out.println("you are odd");
      }
       
    }
}