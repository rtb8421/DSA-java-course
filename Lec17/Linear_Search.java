package Lec17;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, -1, 3, 5, 9, -3, 11, 15};
        int target = -3;
        search(arr, target);
    }

    public static void search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}