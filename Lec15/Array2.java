package Lec15;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] other = {10, 11, 12, 13, 14, 15, 16, 17, 18, 90};

        System.out.println(arr[0] + " " + arr[1]);// 0 1
        swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);// 0 1
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}