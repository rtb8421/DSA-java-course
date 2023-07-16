package Lec33;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_sum_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> opr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            opr1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        ArrayList<Integer> opr2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            opr2.add(sc.nextInt());
        }
        Display(arraySum(opr1,opr2));

    }
    public static ArrayList<Integer> arraySum(ArrayList<Integer> opr1 , ArrayList<Integer> opr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        while(!opr1.isEmpty() || !opr2.isEmpty()){
            int sum = 0;

            if(!opr1.isEmpty()){
                sum+=opr1.remove(opr1.size()-1);
            }

            if(!opr2.isEmpty()){
                sum+=opr2.remove(opr2.size()-1);
            }
            sum += carry;
            ans.add(0,sum%10);
            carry = sum/10;
        }
        if(carry>0){
            ans.add(0,carry);
        }
        return ans;
    }
    public static void Display(ArrayList<Integer> a) {
        for (int x : a) {
            System.out.print(x + ", ");
        }
        System.out.print("END");
    }
}
