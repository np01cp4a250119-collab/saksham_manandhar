import java.util.Scanner;

public class workshop4_q8
{
   public static void main(String[] args){
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "gpa:");
      float gpa =scanner.nextInt();
       
       if(gpa>=0.0 && gpa<=4.0){
               System.out.println("its valid gpa");
           }
      else{
          System.out.println("gpa ia invalid");
      }
       
    }
}