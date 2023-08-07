package Lec42;
import java.util.*;

public class Pallindrome_Patrtioning {
    public static void main(String[] args) {
        String s = "nitin";
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        palidromePartition(s,"", list,ans);
        System.out.println(ans);
    }
    public static void palidromePartition(String ques , String ansOld , List<String> list , List<List<String>> ans){

        if(ques.length()==0){
//            System.out.println(ans);
//            System.out.println(list);
//            List<String> list1 = new ArrayList<>(list);
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String insideString = ques.substring(0,i);
            if(isPalindrome(insideString)==true) {
                list.add(insideString);
                palidromePartition(ques.substring(i), ansOld+ "," + insideString, list , ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

}

