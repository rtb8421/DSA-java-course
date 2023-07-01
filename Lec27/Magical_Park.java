package Lec27;

import java.util.Scanner;

public class Magical_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();

        String [][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next();
            }
        }
        escapingPark(arr,s,k);
    }
    public static void escapingPark(String [][] arr, int S , int K) {
        for (int row = 0; S >= K && row < arr.length; row++) {
            for (int col = 0; S >= K && col < arr[0].length; col++) {
                if (arr[row][col].equals(".")) {
                    S = S - 2;
                }
                if (arr[row][col].equals("#")) {
                    break;
                }
                if (arr[row][col].equals("*")) {
                    S = S + 5;
                }
                if (!arr[row][col].equals("#") && col < arr[0].length - 1) {
                    S = S - 1;
                }
            }
        }
        if (S >= K) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}
