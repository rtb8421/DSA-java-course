package Lec11;

import java.util.Scanner;

public class Inverse_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + count * (int) Math.pow(10, rem - 1);
            count++;
            n /= 10;//n= n / 10;
        }
        System.out.println(sum);
    }
}
