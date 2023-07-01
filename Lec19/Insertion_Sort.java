package Lec19;

public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,1};
        Display(arr);
        insertionSort(arr);
        Display(arr);
    }
    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int childInd = i;
            int child = arr[childInd];
            int j = childInd - 1;
            while(j>=0 && child<arr[j]){
                
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = child;
        }
    }
    public static void Display(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
