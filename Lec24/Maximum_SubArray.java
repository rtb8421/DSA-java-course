package Lec24;

public class Maximum_SubArray {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-4,-1};
        System.out.println(subarray(arr));
    }
    public static int subarray(int[] arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length ; j++) {
                sum+=arr[j];
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}
