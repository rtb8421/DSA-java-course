package Lecture2;

import java.util.Scanner;

public class print_0dd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int i = 1;
        int sum = 0;
        while (i <= n) {
                sum = sum + i;
                i=i+2;
            }
        System.out.println(sum);
        }

    }
