package Lec34;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int noS = sc.nextInt();
            int noC = sc.nextInt();
            int [] arr = new int[noS];
            for (int i = 0; i < noS; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(kumUgrava(arr,noS,noC));
            t--;
        }
    }
    public static int kumUgrava(int [] stall , int nos , int noc){
        Arrays.sort(stall);
        int low = 0 ;
        int high = stall[nos-1] - stall[0];
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(cowsPlaced(mid , stall , noc)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static boolean cowsPlaced(int minDist , int[] stall, int noc) {
        int cow = 1;
        int pos = stall[0];
        int i = 1;
        while (i < stall.length) {
            if (stall[i] - pos >= minDist) {
                cow++;
                pos = stall[i];
            }
            if (cow >= noc) {
                return true;
            }
            i++;
        }
        return false;
    }
}
