//BASIC CONCEPT

public class basicJAVA{
    
    public static void main(String[] argus){
        
        
        int age = 90;   // FOR numbers only no 0.00
        int class1 = 2;
        
        double price =99.9999;  // for .00
        double weight =80;
         
        char SingleAlphabet= 'a';  // for single character [! , @ , # ,$ ,% ,^ ,A ,b ,C]
     char symbol= '$';
        
        String name="saksham"; // for sentences [ eg; my name is code roll no 11.90 ]
        String gmail="coding@gmail.com";
        
        boolean TrueORFales = true; // [ only for true and false]
        boolean TrueORFales2 = false;
        
        
        /* if  you want to print different types of 
        character name int in single print then do +" " 
        (put space in between /  "  "  / )  */
        
        
         System.out.println("all in one " + age + " " +price + " " + name + " " + TrueORFales);
        
        
        
        //conditions boolean 
         
        if (TrueORFales2){
            System.out.println ( age + " " + name);
        }
        else{
            System.out.println ( symbol + " " + price);
        }
        
       

        
        
    }
    
    
    
    
    
    
    
    
    
     
    

    
    
    
    
    
    
    
}