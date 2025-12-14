public class w6_q7 {
    public static void main(String[] args) {

        String[][] seats = new String[2][3];

        seats[0][0] = "ram";
        seats[0][1] = "saksham";
        seats[0][2] = "rohit";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (seats[i][j]== null) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print(seats[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
