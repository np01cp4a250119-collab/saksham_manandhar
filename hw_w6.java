public class hw_w6 {
    public static void main(String[] args) {

        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "sakshambook";
        prices[0][0] = 550.0;

        titles[1][0] = "Asahamati - 5";
        prices[1][0] = 750.0;

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < 1; j++) {
                System.out.println("Title: " + titles[i][j]);
                System.out.println("Price: " + String.format("%.2f", prices[i][j]));
            }

            System.out.println();
        }
    }
}
