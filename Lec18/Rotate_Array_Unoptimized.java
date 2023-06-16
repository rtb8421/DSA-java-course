package Lec18;

public class Rotate_Array_Unoptimized {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        Display(arr);
        rotate(arr,k);
        Display(arr);

    }
    public static void rotate(int [] arr , int k ){
        k=k%arr.length;
        while(k>0){
            int temp = arr[arr.length-1];
            for (int i = arr.length-2; i >= 0 ; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
    }
    public static void Display(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
