package Lecture5;

import java.util.Scanner;

public class primr_lit_opt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        long a = System.nanoTime();
        while(i<n){
            if(n%i==0){
                System.out.println("Not Prime");
                long b = System.nanoTime();
                System.out.println((b-a)+" ns");
                return;
            }
            i++;
        }
        System.out.println("Prime");
        long b = System.nanoTime();
        System.out.println((b-a)+" ns");//stringfy
    }
}
