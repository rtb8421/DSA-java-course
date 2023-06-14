package Lec16;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[2];
        ans = twoSum(arr, target);
        for (int i = 0; i < 2; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int sum = 0;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }
}