package Lec26;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        Display(arr);
        transpose(arr);
        Display(arr);
    }

    public static void transpose(int [] [] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if(row>=col){
                    swap(arr,row,col);
                }
            }
        }
    }

    public static void swap(int[] [] arr , int row , int col){
        int temp = arr[row][col];
        arr[row][col] = arr[col][row];
        arr[col][row] = temp;
    }

    public static void Display(int[] [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
