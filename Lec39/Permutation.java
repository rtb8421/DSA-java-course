package Lec39;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permute(str,"");
    }
    public static void permute(String ques ,String ans){
        if(ques.length()<=0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String a = ques.substring(0,i);
            String b = ques.substring(i+1);
            permute(a+b,ans+ch);
        }
    }
}
