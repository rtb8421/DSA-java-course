package Lec43;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,9,1,4};
        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
    }
    public static int[] mergeSort(int[] arr , int si , int ei){

        if(si==ei){
            int [] newArr = new int[1];
            newArr[0] = arr[si];
            return newArr;
        }

        int mid = (ei+si)/2;
        int [] a = mergeSort(arr,si,mid);
        int [] b = mergeSort(arr,mid+1,ei);
        return merging(a,b);

    }
    public static int[] merging(int[] a , int[] b){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] ans = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i] > b[j]){
                ans[k] = b[j];
                k++;
                j++;
            }else{
                ans[k] = a[i];
                k++;
                i++;
            }
        }
        while(i<a.length){
            ans[k] = a[i];
            k++;
            i++;
        }
        while(j<b.length){
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }
}
