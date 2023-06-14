package Lec7;

import java.util.Scanner;

public class Pascal_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int rows = 0;
        while(rows < n) {
            int i = 0;
            int prod = rows;
            while(i<stars){
                if(i==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(prod+" ");
                    prod = (prod * (rows-i)) / (i+1);
                }
                i++;
            }
            rows++;
            stars++;
            System.out.println();
        }
    }
}

