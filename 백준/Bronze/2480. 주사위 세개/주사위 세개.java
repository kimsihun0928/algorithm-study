import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a==b){
            if (a == c){
                int price = 10000 + a*1000;
                System.out.println(price);
            }else{
                int price = 1000 + a*100;
                System.out.println(price);
            }
        }else if (b == c) {
            int price = 1000 + b*100;
            System.out.println(price);
        }else if (a == c) {
            int price = 1000 + c*100;
            System.out.println(price);
        }else{
            int max =Math.max(a, Math.max(b, c));
            System.out.println(max*100);
        }
        scan.close();
}
}