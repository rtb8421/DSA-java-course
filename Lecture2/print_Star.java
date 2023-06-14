package Lecture2;

import java.util.Scanner;

public class print_Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =1;
        while(i<=5)
        {
            System.out.print(" *");
            i++;
        }
    }
}
