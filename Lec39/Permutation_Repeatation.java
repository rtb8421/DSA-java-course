package Lec39;

public class Permutation_Repeatation {
    public static void main(String[] args) {
        String str = "abaacaaa";
        permute(str,"");
    }
    public static void permute(String ques ,String ans){
        if(ques.length()<=0){
            System.out.println(ans);
            return;
        }
        boolean[] arr = new boolean[26];
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if(arr[ch-'a']==false) {
                arr[ch-'a'] = true;
                String a = ques.substring(0, i);
                String b = ques.substring(i + 1);
                permute(a + b, ans + ch);
            }
        }
    }
}
