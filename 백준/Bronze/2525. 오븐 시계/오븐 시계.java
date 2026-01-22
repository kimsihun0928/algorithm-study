import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int timeHour = sc.nextInt();
        int timeMin = sc.nextInt();
        int set = sc.nextInt();

        int a = timeMin + set;

        if (a >= 60) {
            if (timeHour + a / 60 >= 24){
                System.out.printf("%d %d", (timeHour + a / 60)-24, a % 60);
            }else{
                System.out.printf("%d %d", timeHour + a / 60, a % 60);
            }
        } else {
            System.out.printf("%d %d", timeHour, a);
        }
    }
}
