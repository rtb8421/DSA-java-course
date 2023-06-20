package Lecture2;

import java.util.Scanner;

public class qs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

       /* for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r+i;j++)

            {
                System.out.print("  ");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print("* ");
            }
            System.out.println();

        }*/
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n+i)
            {
                System.out.print("  ");
                j++;
            }
            int k=5;
            while(k>=i)
            {
                System.out.print("* ");
                k--;
            }
            i++;
            System.out.println();
            {

            }
        }
    }
}
