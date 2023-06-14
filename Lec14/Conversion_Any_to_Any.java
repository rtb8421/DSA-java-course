package Lec14;

import java.util.Scanner;

public class Conversion_Any_to_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        if (sb == 10 || db == 10) {
            System.out.println(gharWapsi(sb, db, sn));
        } else {
            int firstWapsi = gharWapsi(sb, 10, sn);
            System.out.println(gharWapsi(10, db, firstWapsi));
        }

    }

    public static int gharWapsi(int sb, int db, int sn) {
        int sum = 0;
        int mul = 1;
        while (sn > 0) {
            int rem = sn % db;
            sum += rem * mul;
            mul *= sb;
            sn /= db;
        }
        return sum;
    }
}