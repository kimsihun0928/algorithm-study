import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ----* 4 1
        // ---** 3 2
        // --*** 2 3
        // -**** 1 4
        // ***** 0 5

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            for (int j = T - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
