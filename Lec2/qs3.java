package Lecture2;

import java.util.Scanner;

public class qs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        /*for(int i=1;i<=n;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        int row=1;
        int star=5;

        while(row<=n)
        {
            int i=5;
            while(i>=row)
            {
                System.out.print("* ");
                i--;
            }
            row++;
            star--;
            System.out.println();
        }
    }
}
