package Lecture3;

import java.util.Scanner;

public class qs6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = 0;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            space += 2;
            star--;
            row++;
            System.out.println();
        }
    }
}
