package Lec6;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        if (n < 1) {
            System.out.println(0);
            return;
        }
        for (int i = 3; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.print(a + " ");
        System.out.println(b);
    }
}
