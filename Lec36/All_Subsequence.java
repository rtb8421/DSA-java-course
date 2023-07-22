package Lec36;

public class All_Subsequence {
    public static void main(String[] args) {
        subsequence("abc","");
    }
    public static void subsequence(String ques , String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        subsequence(ques.substring(1),ans+"");
        subsequence(ques.substring(1),ans+ch);

    }
}
