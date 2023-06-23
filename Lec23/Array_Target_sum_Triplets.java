package Lec23;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        tripletSum(arr,target);

    }
    public static void tripletSum(int [] arr , int target){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i+1, k = arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k] == target){
                    System.out.println(arr[i]+", "+arr[j]+" and " +arr[k] );
                    k--;
                }else if (arr[i]+arr[j]+arr[k] > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
    }
}
