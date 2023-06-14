import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int case1 = (int) Math.sqrt(m);
            int prod = (int) Math.pow(case1, 2) + case1;

            if (n >= prod) {
                System.out.println("Harshit");
            } else {
                System.out.println("Aayush");
            }

            t--;
        }
    }
}