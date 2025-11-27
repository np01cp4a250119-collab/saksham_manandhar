import java.util.Scanner;

public class workshop4_q4
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "enter number:");
      int num =scanner.nextInt();
       
       if(num % 3==0 && num%5==0){
           System.out.println("its divided by both 3 and 5");
        }
        else if (num%3==0){
            System.out.println("its divided only 3");
        }
        else if (num%5==0){
            System.out.println("its only divided only 5");
        }
       
    }
}