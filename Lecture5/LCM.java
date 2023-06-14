package Lecture5;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        while(i%a!=0 || i%b!=0){
            i++;
        }
        System.out.println(i);
    }
}
