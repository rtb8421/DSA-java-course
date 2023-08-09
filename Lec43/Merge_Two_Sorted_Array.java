package Lec43;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] a = {3,5,7,9,11};
        int[] b = {1,2,3,4,6,7};
        System.out.println(Arrays.toString(merging(a,b)));
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
