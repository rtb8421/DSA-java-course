package Lec31;

public class Fixed_Window_Sliding {
    public static void main(String[] args) {
        int[] arr = {23,17,2,5,18,12,25};
        int k = 3;
        System.out.println(fixedWindow(arr,k));
    }
    public static int fixedWindow(int[] arr, int k){
        int sum = 0;
        int ans = 0;
        //window making
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
