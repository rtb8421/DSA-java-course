package Lec17;

public class Reverse_Array_within_Range {
    public static void main(String[] args) {
        int [] arr = {2,-1,3,5,9,-3,11,15};
        Display(arr);
        reverse_within_range(arr,3,5);
        Display(arr);
    }

    public static void reverse_within_range(int [] arr, int i1 , int j1 ){
        int n = j1-i1 + 1;
        int count = 0;
        for (int i= i1, j = j1 ; count < n/2 ; i++,j--){
            swap(arr,i,j);
            count++;
        }
    }

    public static void swap(int [] arr , int i  , int j){
        int temp = arr[i] ;
        arr [i] = arr[j] ;
        arr[j] = temp;
    }

    public static void Display(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
