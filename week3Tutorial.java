
public class week3Tutorial
{
    int age; //instant variable
    static int qty; //static variable
    
    public static void main(String[] args){
        int i=1010; //location variable
        System.out.println(i);
        
        
        //implicit typecasting
        
        double db =i;
        System.out.println(db);
        
        
        //explicit typecasting
        
        double dtb=10.99999;
        int aaa=(int)dtb;
        System.out.println(aaa);
        
        
        //explicit in arthematic
        
        byte bt=126;
        byte btr=1;
        
        byte sum=(byte)(bt+btr);
       System.out.println(sum);
       
       System.out.println("----><-----");
       // max,MIN,SIZE AND BYTES
       
       System.out.println(Byte.MAX_VALUE);
       System.out.println(Byte.MIN_VALUE);
       System.out.println(Byte.SIZE);
       System.out.println(Byte.BYTES);
       
       //ESCAPE SEQUENCE
       
       System.out.println("SAKSHAM\nMANANDHAR"); //new line
       System.out.println("SAKSHAM\tMANANDHAR");  //tab
       System.out.println("she said \"HI\""); //double quation
       
       //unicode escape sequence
       
       System.out.println("\u2764");
    }
    
}