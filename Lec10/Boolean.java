package Lec10;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        System.out.println(a);
//        boolean b = sc.nextBoolean();
//        System.out.println(b);
        while (sc.hasNextBoolean()) {
            System.out.println(sc.nextBoolean());
        }
    }
}
