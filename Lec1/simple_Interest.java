package Lecture1;

import java.util.Scanner;

public class simple_Interest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int si = (p*n*r)/100;

        System.out.println(si);
    }
}
