package Lec18;

public class Rotate_Array {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            k = k % arr.length;
            reverse_within_range(arr, 0, arr.length - 1);
            reverse_within_range(arr, 0, k - 1);
            reverse_within_range(arr, k, arr.length - 1);
        }

        public static void reverse_within_range(int[] arr,int i,int j){
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        public static void swap ( int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }