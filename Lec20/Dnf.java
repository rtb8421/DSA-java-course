package Lec20;

public class Dnf {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 1, 0, 2, 1, 0, 1};
        Display(arr);
        dnf(arr);
        Display(arr);

    }

    public static void dnf(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            } else {
                swap(arr, j, i);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
