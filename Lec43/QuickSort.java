package Lec43;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,9,1,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int si , int ei){
        if(si>=ei){
            return;
        }
        int pivot = findPivot(arr,si,ei);
        quickSort(arr,si,pivot-1);
        quickSort(arr,pivot+1,ei);
    }
    public static int findPivot(int[] arr , int si , int ei){
        int pi = si;
        for (int i = si; i <= ei; i++) {
            if(arr[ei] > arr[i]){
                swap(arr,i,pi);
                pi++;
            }
        }
        swap(arr,pi,ei);
        return pi;
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
