import java.util.Scanner;

public class workshop4_q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter marked price of the item: ");
        float mp = scanner.nextFloat();

        System.out.print("Enter category of the item (A/B/C/D): ");
        char category = scanner.next().charAt(0);

        float discount = 0;

        
        if (category == 'A' || category == 'a') {
            discount = 60;
        } else if (category == 'B' || category == 'b') {
            discount = 40;
        } else if (category == 'C' || category == 'c') {
            discount = 20;
        } else if (category == 'D' || category == 'd') {
            discount = 10;
        } 
        
        float sp = mp - (mp * discount / 100);
        System.out.println("Selling price of the item: Rs " + sp);
    }
}
