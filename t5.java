import java.util.Scanner;

public class t5{
    public static void main(String[] argus){
        int factorial=1;
        Scanner input=new Scanner(System.in);
        System.out.println("ask for number : ");
        int num= input.nextInt();
        
      for(int i=1; i<=num; i++){
          
          factorial=factorial*i;
          
      }
        System.out.println(factorial);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
     
    
    
}