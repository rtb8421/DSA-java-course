package Lec19;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {5,3,-7,4,8,2};
        Display(arr);
        selection_Sort(arr);
        Display(arr);
    }
    public static void selection_Sort(int[]arr){

        for(int loop = 0 ; loop < arr.length-1 ; loop++){
            int base = arr[loop];
            int minIdx = loop;

            for (int i = loop+1; i < arr.length; i++) {
                if(arr[minIdx]>arr[i]){
                    minIdx = i;
                }
            }
//        arr[0] = arr[minIdx];
            swap(arr,minIdx,loop);
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
