package Lec31;

import java.util.Scanner;

public class Kartik_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        int ans = Math.max (maxPerfectness(str,k,'a'),
                maxPerfectness(str,k,'b'));
        System.out.println(ans);
    }
    public static int maxPerfectness(String str , int k, char c) {
        int ei = 0;
        int si = 0;
        int ans = 0;
        int flip = 0;
        while (ei < str.length()) {
            //grow
            if (str.charAt(ei) == c) {
                flip++;
            }
            //shrink
            while (ei >= si && flip > k) {
                if (str.charAt(si) == c) {
                    flip--;
                }
                si++;
            }
            //record ans
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
