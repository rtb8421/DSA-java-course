package Lecture4;

import java.util.Scanner;

public class qs33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            int j = 1;
            int count = n-(row-1);//5 - (row-1)
            while(j<=star){

                if(j>row){
                    System.out.print(count+" ");
                    count--;
                }else if(j==row){
                    System.out.print(0+" ");
                    count--;
                }
                else{
                    System.out.print(count+" ");
                    count++;
                }
                j++;
            }

            star+=2;
            space--;
            row++;
            System.out.println();
        }
    }
}
