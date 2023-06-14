package Lec15;

import java.util.Scanner;

public class Simple_input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt() == true) {
            int n = sc.nextInt();
            sum += n;
            if (sum > 0) {
                System.out.println(n);
            } else {
                return;
            }
        }
    }
}
