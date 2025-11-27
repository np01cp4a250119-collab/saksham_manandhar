import java.util.Scanner;

public class workshop4_q3
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print("enter num");
      int num =scanner.nextInt();
       
       if(num>0){
               System.out.println("its positive");
           }
      else if (num<0){
          System.out.println("its negative");
      }
      else{
          System.out.println("its zero");
      }
       
    }
}