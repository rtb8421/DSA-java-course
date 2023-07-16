package Lec29;

import java.util.Scanner;

public class Replace_All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(replace(s));
    }

    public static String replace(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                ans += '5';
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}

