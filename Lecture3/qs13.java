package Lecture3;

import java.util.Scanner;

public class qs13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i,j;

        /*for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        i=1;
        while(i<=n) {
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        i=n;
        while(i>=1)
        {
            j=1;
            while(j<i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

}