import java.util.Scanner;

public class workshop4_q5
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "enter number:");
      int num =scanner.nextInt();
       
       if(num % 3==0 ){
           if(num % 5==0 ){
               System.out.println("its divided by both 3 and 5");
           }
           else{
               System.out.println("only divided by 3");
           }
        }
       else if(num%5==0){
           System.out.println("its divided by only 5");
       }
       
    }
}