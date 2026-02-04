import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int arr[] = new int[T];
        int count = 0;

        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int V = sc.nextInt();

        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == V) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();

        
    }
}
