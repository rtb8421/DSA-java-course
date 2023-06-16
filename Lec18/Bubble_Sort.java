package Lec18;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {3,5,-7,4,8,2};
        Display(arr);
        bubbleSort(arr);
        Display(arr);
    }
    public static void bubbleSort(int [] arr ){
        for(int loop = 1 ; loop < arr.length ; loop++){
            for(int i = 0 ; i < arr.length - loop ; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
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
