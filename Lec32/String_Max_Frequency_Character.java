package Lec32;

import java.util.Scanner;

public class String_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        maxFreq(str);
    }
    public static void maxFreq(String str) {

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int maxi = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[maxi] < freq[i]) {
                maxi = i;
            }
        }
        System.out.println((char) (maxi + 'a'));
    }
}
