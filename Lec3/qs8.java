package Lecture3;

import java.util.Scanner;

public class qs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n+1)
            {
                if(i==j || i+j==n+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
