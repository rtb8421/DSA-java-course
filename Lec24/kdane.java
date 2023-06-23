package Lec24;

public class kdane {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-4,-1};
        System.out.println(subarray(arr));
    }
    public static int subarray(int[] arr){
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
