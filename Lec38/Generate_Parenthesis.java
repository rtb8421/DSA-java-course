package Lec38;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        System.out.println(ans);
    }
    public static void generate(int n , int open , int close , String ans , List<String> list){
        if(open==n && close == n){
            list.add(ans);
            return;
        }

        if(open<n) {
            generate(n, open + 1, close, ans + "(",list);
        }
        if(open>close) {
            generate(n, open, close + 1, ans + ")",list);
        }

    }
}
