package Lec12;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int input){
        int copyIp = input;
        int noOfDigits = nod(input);
        int ans = 0;
        while(input>0){
            int rem = input%10;
            ans = ans+(int)Math.pow(rem,noOfDigits);
            input/=10;
        }
        if(copyIp==ans){
            return true;
        }else{
            return false;
        }
//        return copyIp==ans;
    }

    public static int nod(int givenInput) {
        int count = 0;
        while(givenInput>0){
            givenInput = givenInput/10;
            count++;
        }
        return count;
    }
}
