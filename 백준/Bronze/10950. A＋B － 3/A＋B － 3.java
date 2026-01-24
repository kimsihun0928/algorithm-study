import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rept = sc.nextInt();
        int[] arr = new int[rept];

        for (int i = 0; i < arr.length; i++) {
            int a= sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a+b;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
