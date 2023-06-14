package Lec15;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] other = {10, 11, 12, 13, 14, 15, 16, 17, 18, 90};

        System.out.println(arr[0] + " " + other[0]);// 0  10
        swap(arr[0], other[0]);
        System.out.println(arr[0] + " " + other[0]);// 10 0
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
