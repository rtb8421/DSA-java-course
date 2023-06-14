package Lec15;

import java.util.Scanner;

public class Array_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        Display(marks);
    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}