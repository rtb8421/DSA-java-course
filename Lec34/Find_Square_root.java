package Lec34;

import java.util.Scanner;

public class Find_Square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sqrt(n);
    }
    public static void sqrt(long n ){
        long low = 0;
        long high = n;
        long ans = 0;
        while(low <= high){
            long mid = (low+high)/2;
            if(mid*mid <= n){
                ans = mid;
                low = mid + 1;
            }else if (mid*mid > n){
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
