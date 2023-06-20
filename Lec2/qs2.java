package Lecture2;

import java.util.Scanner;

public class qs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        int row=1;
        int star=1;

        while(row<=n)
        {
            int i=1;

            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
