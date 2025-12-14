import java.util.Scanner;

public class w6q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};

        System.out.println("Marks:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double avg = (double) sum / a.length;

        int high = a[0];
        int low = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > high) {
                high = a[i];
            }
            if (a[i] < low) {
                low = a[i];
            }
        }

        System.out.println("Total = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Highest = " + high);
        System.out.println("Lowest = " + low);

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Updated marks:");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
        }

        int sum2 = 0;
        int high2 = marks[0];
        int low2 = marks[0];

        for (int i = 0; i < n; i++) {
            sum2 = sum2 + marks[i];

            if (marks[i] > high2) {
                high2 = marks[i];
            }
            if (marks[i] < low2) {
                low2 = marks[i];
            }
        }

        System.out.println("Total = " + sum2);
        System.out.println("Average = " + ((double) sum2 / n));
        System.out.println("Highest = " + high2);
        System.out.println("Lowest = " + low2);
    }
}
