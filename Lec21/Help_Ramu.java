package Lec21;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int n = sc.nextInt();
            int m = sc.nextInt();

            int [] rick = new int[n];
            int [] cab = new int[m];

            for (int i = 0; i < n; i++) {
                rick[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                cab[i] = sc.nextInt();
            }

            int costOfRick = 0;
            for (int i = 0; i < n; i++) {
                costOfRick += Math.min(c1*rick[i],c2);
            }
            int afterc3Rick = Math.min(costOfRick, c3);
            int costOfCab = 0;
            for (int i = 0; i < m; i++) {
                costOfCab += Math.min(c1*cab[i],c2);
            }

            int afterc3Cab = Math.min(costOfCab, c3);

            int totalRideCost = (Math.min(afterc3Cab+afterc3Rick,c4));
            System.out.println(totalRideCost);

            t--;
        }
        
    }
}
