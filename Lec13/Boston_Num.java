package Lec13;

import java.util.Scanner;

public class Boston_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isBostonNumber(n));
    }
    public static int isBostonNumber(int n ){
        int sum = 0;
        int givenSum = sumOfDigit(n);
        int i = 2;
        while(i<=n){
            if(n%i==0){
                n=n/i;
                sum+=sumOfDigit(i);
            }else{
                i++;
            }

        }
        if(sum==givenSum){
            return 1;
        }else{
            return 0;
        }

    }
    public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n/=10;
        }
        return sum;
    }
}

