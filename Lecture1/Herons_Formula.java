package Lecture1;

import java.util.Scanner;

public class Herons_Formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double S = (s1+s2+s3)/2.0;
        double area = (double)Math.sqrt(S*(S-s1)*(S-s2)*(S-s3));

        System.out.println(area);
    }
}
