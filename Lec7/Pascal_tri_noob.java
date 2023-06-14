package Lec7;

import java.util.Scanner;

public class Pascal_tri_noob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int rows = 0;
        while(rows < n){
            int i = 0;
            int prod = 1;
            int num = rows;
            int deno = 1;
            while(i<stars){
                if(i==0){
                    System.out.print(1+" ");
                }else{
                    prod = (prod * num)/deno;
                    System.out.print(prod+" ");
                    num--;
                    deno++;
                }
                i++;
            }
            rows++;
            stars++;
            System.out.println();
        }
    }
}

