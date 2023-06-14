package Lec11;

import java.util.Scanner;

public class Bin_to_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        int prod = 0;
        while (n > 0) {
            int rem = n % 10;
            prod = prod + (mul * rem);
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(prod);
    }
}
