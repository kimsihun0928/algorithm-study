import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rept = sc.nextInt();

        for (int i = 1; i < rept / 4; i++) {
            System.out.print("long ");
        }
        System.out.println("long int");

        sc.close();
    }
}
