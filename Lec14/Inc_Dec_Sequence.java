package Lec14;

import java.util.Scanner;

public class Inc_Dec_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        boolean flag = false;
        while (n - 1 > 0) {
            int b = sc.nextInt();
            if (checkIDS(a, b, flag) == true) {
                if (a < b) {
                    flag = true;
                }
            } else {
                System.out.println(false);
                return;
            }
            //last रे
            a = b;
            n--;
        }
        System.out.println(true);
    }

    public static boolean checkIDS(int a, int b, boolean flag) {
        if (flag == true && a > b) {
            return false;
        }
        return true;
    }
}
