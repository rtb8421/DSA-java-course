package Lec30;

import java.util.Scanner;

public class Playing_with_good_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(goodString(str));
    }

    public static int goodString(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))){
                int count = 0;
                while (i < str.length() &&  isVowel(str.charAt(i))) {
                    count++;
                    i++;
                }
                ans = Math.max(count,ans);
            }
        }
        return ans;
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;

    }
}
