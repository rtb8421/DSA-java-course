package Lec28;

import java.util.Scanner;

public class Divisible_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            divSub(arr,n);
            t--;
        }
    }
    public static void divSub(int[] arr , int n ) {
        long[] freq = new long[n];
        long sum = 0;
        freq[0] = 1;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            int idx = (int) (sum % n);
            if (idx < 0) {
                idx += n;
            }
            freq[idx] = freq[idx] + 1;
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long p = freq[i];
            ans = ans + (p * (p - 1)) / 2;
        }
        System.out.println(ans);
    }
}
