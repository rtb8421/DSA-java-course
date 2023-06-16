package Lec17;

public class Reverse_An_Array {
    public static void main(String[] args) {
        int [] arr = {2,-1,3,5,9,-3,11,15};
        Display(arr);
        reverse(arr);
        Display(arr);

    }
    public static void reverse(int [] arr){
        for (int i = 0, j =arr.length-1 ; i <arr.length/2 ; i++,j--) {
            swap(arr,i,j);
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
