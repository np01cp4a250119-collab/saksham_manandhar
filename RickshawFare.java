import java.util.Scanner;
// SAKSHAM MANANDHAR C4 sakshammanandhar2007@gmail.com
public class RickshawFare {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();

        System.out.print("Are you local? (yes/no): ");
        String isLocal = sc.next();

        System.out.print("night time? (yes/no): ");
        String isNight = sc.next();

        
        double baseFare = 50;     
        double perKm = 20 * distance; 
        double perMin = 2 * time;    

        double total = baseFare + perKm + perMin;

        
        double localDiscount = isLocal.equalsIgnoreCase("yes") ? 0.10 : 0.0;
        if (distance >= 10) {
            total = total - (total * localDiscount);
        }

        
        double nightCharge = isNight.equalsIgnoreCase("yes") ? 0.20 : 0.0;
        total = total + (total * nightCharge);

        
        System.out.println("Total Fare: Rs. " + (int)total);
        
    }
}
