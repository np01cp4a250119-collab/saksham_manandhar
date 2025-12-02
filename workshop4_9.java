import java.util.Scanner;

public class workshop4_9
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "enter mark:");
      int mark =scanner.nextInt();
       
       if(mark>=40){
               System.out.println("you are pass");
           }
      else{
          System.out.println("you are fail");
      }
       
    }
}