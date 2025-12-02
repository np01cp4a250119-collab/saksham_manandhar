import java.util.Scanner;

public class workshop4_q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("GPA: ");
        float gpa = scanner.nextFloat();

        if (gpa >= 0.0 && gpa <= 4.0) {
            System.out.println("It's a valid GPA");

            if (gpa>=3.6 && gpa <= 4.0) {
                System.out.println("Your grade is A+");
            } else if (gpa >= 3.0 && gpa <= 3.5) {
                System.out.println("Your grade is A");
            } else if (gpa >= 2.5 && gpa <= 2.9) {
                System.out.println("Your grade is B+");
            } else if (gpa >= 2.4 && gpa <= 2.49) {
                System.out.println("Your grade is B");
            } else if (gpa >= 2.0 && gpa <= 2.39) {
                System.out.println("Your grade is C+");
            } else if (gpa >= 1.6 && gpa <= 1.99) {
                System.out.println("Your grade is C");
            } else if (gpa >= 0.0 && gpa <= 1.59) {
                System.out.println("Your grade is D+");
            }

        } 
        else {
            System.out.println("GPA is invalid");
        }
    }
}
