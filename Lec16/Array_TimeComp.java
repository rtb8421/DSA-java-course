package Lec16;

import java.util.Scanner;

public class Array_TimeComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] marks = new int[n];
        marks[0] = -1;
        marks[1] = 50;
        marks[2] = 20;
        marks[3] = 30;
        marks[4] = 100;
//        int arr1[] = new int[5];
        Display(marks);
    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
