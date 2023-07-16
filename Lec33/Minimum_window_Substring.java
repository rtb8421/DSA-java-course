package Lec33;

public class Minimum_window_Substring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minSizeWin(s,t));
    }
    public static String minSizeWin(String str , String strMatch) {
        int[] freq = new int[128];
        int[] matchFreq = new int[128];

        boolean flag = false;
        int ei = 0;
        int si = 0;
        int ans = 0;
        int startIdx = 0;
        int endIdx = 0;
        int charCount = 0;
        int matchcharCount = 0;

        for (int i = 0; i < strMatch.length(); i++) {
            matchFreq[strMatch.charAt(i)]++;
            if (matchFreq[strMatch.charAt(i)] == 1) {
                matchcharCount++; //3
            }
        }

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
            if (freq[str.charAt(i)] == matchFreq[str.charAt(i)]) {
                charCount++;
            }
            if (matchcharCount == charCount) {
                flag = true;
                ei = i;
                ans = ei + 1;
                endIdx = ei;
                freq[str.charAt(ei)]--;
                charCount--;
                break;
            }
        }

        if (str.length() < strMatch.length()) {
            return "";
        }

        while (ei < str.length()) {

            //grow
            freq[str.charAt(ei)]++;
            if (freq[str.charAt(ei)] == matchFreq[str.charAt(ei)]) {
                charCount++;
            }

            //shrink
            while (ei >= si
                    && charCount >= matchcharCount
                    && freq[str.charAt(si)] >= matchFreq[str.charAt(si)]) {

                freq[str.charAt(si)]--;
                if (freq[str.charAt(si)] < matchFreq[str.charAt(si)]) {
                    charCount--;
                }
                si++;
            }

            //record
            if (ans > (ei - si + 2)) {
                ans = ei - si + 2;
                startIdx = si - 1;
                endIdx = ei;
            }
            ei++;
        }
        if (si < 1 || !flag) {
            return "";
        } else {
            return str.substring(startIdx, endIdx + 1);
        }
    }
}
