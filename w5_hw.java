import java.util.Scanner;

public class w5_hw {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch = 'y';

        while(ch=='y' || ch=='Y'){

            System.out.print("Enter amount (min 1000): ");
            double p = sc.nextDouble();

            System.out.print("Enter interest rate (8-12): ");
            double r = sc.nextDouble();

            System.out.print("Enter years (max 5): ");
            int y = sc.nextInt();

            double mRate = (r/100)/12;
            int months = y * 12;

            double A = p * Math.pow((1+mRate), months); 

            double fee = A * 0.005; 
            double finalAmt = A - fee;

            System.out.println("Result::");
            System.out.println("Maturity (before fee): " + A);
            System.out.println("Fee: " + fee);
            System.out.println("Final Amount: " + finalAmt);

            System.out.print("\nDo again? (y/n): ");
            ch = sc.next().charAt(0);
        }

        System.out.println("finish");
    }
}
