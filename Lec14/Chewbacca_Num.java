package Lec14;

import java.util.Scanner;

public class Chewbacca_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(chebaccaNum(n));
    }

    public static long chebaccaNum(long n) {
        long ans = 0;
        long mul = 1;
        while (n > 0) {
            long rem = n % 10;
            if (n <= 9 && rem == 9) {
                ans += mul * 9;
            } else if (rem < 5) {
                ans += mul * rem;
            } else {
                ans += mul * (9 - rem);
            }
            mul *= 10;
            n /= 10;
        }
        return ans;
    }
}
