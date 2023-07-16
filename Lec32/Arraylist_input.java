package Lec32;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Display(list);
    }
    public static void Display(ArrayList<Integer> a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
