package Lec11;

import java.util.Scanner;

public class Dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        int prod = 0;
        while (n > 0) {
            int rem = n % 2;
            prod = prod + (mul * rem);
            mul = mul * 10;
            n = n / 2;
        }
        System.out.println(prod);
    }
}
