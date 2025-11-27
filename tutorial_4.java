import java.util.Scanner;

public class tutorial_4
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "enter num:");
      int num =scanner.nextInt();
       
       if(num % 3 ==0){
           
           if (num % 5 ==0){
               System.out.println("divisible by both 3 and 5");
               
           } 
           else{
               System.out.println("only divisible by 3");
           }
         
      }
      
      
      else{
          System.out.println("not divisible by 3 and 5");
      }
       
    }
}