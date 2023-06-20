package Lec22;

import java.util.Arrays;

public class Product_Of_Self {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        productSelf1(arr);
        String str = Arrays.toString(productSelf(arr));
        System.out.println(str);
    }

    public static int[] productSelf(int[] arr) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        int[] ans = new int[arr.length];

        prefix[0] = 1;
        suffix[arr.length - 1] = 1;

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}
