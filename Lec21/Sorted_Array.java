package Lec21;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sorted_arr(arr);
        Display(arr);
    }
    public static void sorted_arr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i] , 2);// make all arr pow of 2
        }
        Arrays.sort(arr);
    }
    public static void Display(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
