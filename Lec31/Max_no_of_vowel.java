package Lec31;

public class Max_no_of_vowel {
    public static void main(String[] args) {
        String s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        int k = 33;
        System.out.println(fixedWindow(s,k));

    }
    public static int fixedWindow(String str, int k){
        int sum = 0;
        int ans = 0;
        //window making
        for (int i = 0; i < k; i++) {
            if(isVowel(str.charAt(i))){
                sum++;
            }
        }
        ans = Math.max(ans,sum);
        for (int i = k; i < str.length(); i++) {
            if(isVowel(str.charAt(i))){
                sum+=1;
            }
            if(isVowel(str.charAt(i-k))){
                sum-=1;
            }
            ans = Math.max(ans,sum);
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
