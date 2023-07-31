package Lec37;

public class Count_subsequence {
    static int count = 0;
    public static void main(String[] args) {
//        subsequenceCount("abc","");
//        System.out.println(count);
        System.out.println(subsequenceCount1("abc",""));

    }
    public static void subsequenceCount(String ques , String ans){

        if(ques.length()==0){
            System.out.println(ans);
            count++;
            return;
        }

        char ch = ques.charAt(0);
        subsequenceCount(ques.substring(1),ans+"");
        subsequenceCount(ques.substring(1),ans+ch);

    }

    public static int subsequenceCount1(String ques , String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        int a = subsequenceCount1(ques.substring(1),ans+"");
        int b = subsequenceCount1(ques.substring(1),ans+ch);
        return a+b;

    }
}
