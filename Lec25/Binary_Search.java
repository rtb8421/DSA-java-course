package Lec25;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int [] arr , int target){
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/ 2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return -1;
    }
}
