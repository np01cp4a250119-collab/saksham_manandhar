import java.util.Scanner;
public class mero_practice{
  public static void main(String[] args) {
      
      System.out.println( "++++++++++++++++++++");
      
      Scanner scanner= new Scanner(System.in);
      
      System.out.print( "enter class:");
      String class1 = scanner.nextLine();
    
      System.out.print( "enter age:");
      int age=scanner.nextInt();
      
      System.out.print( "student ? (true/false)");
      boolean a =scanner.nextBoolean();
      
      System.out.println("your class and age is ::"+class1+" "+age);
      
      if(a){
         System.out.println("you are student"); 
      }
      else{
          System.out.println("you are nottt student");
      }
      
      
      scanner.close();
      
  }
}
