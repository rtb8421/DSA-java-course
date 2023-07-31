package Lec39;

import java.util.ArrayList;
import java.util.List;

public class Letter_combination {
    public static void main(String[] args) {
        String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        lcpn("27",key,"" , list);
        System.out.println(list);
    }
    public static void lcpn(String ques , String[] key ,String ans , List<String> list ){
        if(ques.length()==0){
//            System.out.println(ans);
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String alpha = key[ch-'0'];
        for (int i = 0; i < alpha.length(); i++) {
            lcpn(ques.substring(1) , key , ans+alpha.charAt(i) , list );
        }
    }
}
