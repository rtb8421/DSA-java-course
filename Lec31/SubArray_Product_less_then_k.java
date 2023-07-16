package Lec31;

public class SubArray_Product_less_then_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        int k = 10;
        System.out.println(subarrProd(arr, k));
    }

    public static int subarrProd(int[] arr, int k) {
        int si = 0;
        int ei = 0;
        int prod = 1;
        int ans = 0;
        while (ei < arr.length) {
//            grow kara
            prod = prod * arr[ei];

//            shrink kara
            while (ei >= si && prod >= k) {
                prod = prod / arr[si];
                si++;
            }
//            ans save karma

            ans = ans + ei - si + 1;
            ei++;
        }
        return ans;
    }
}