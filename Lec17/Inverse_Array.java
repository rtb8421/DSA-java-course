package Lec17;

public class Inverse_Array {
    public static void main(String[] args) {
        int [] arr = {2,-1,3,5,9,-3,11,15};
        Display(arr);
        reverse_within_range(arr,3,5);
//        reverse(arr);
        Display(arr);
    }

    public static void reverse_within_range(int [] arr, int i , int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
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
