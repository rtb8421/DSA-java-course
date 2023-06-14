package Lecture5;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        int i = 2;
        long a = System.nanoTime();
        while(i<n){
            if(n%i==0){
                fact++;
            }
            i++;
        }
        if(fact>=1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
        long b = System.nanoTime();
        System.out.println((b-a)+" ns");//stringfy
    }
}
