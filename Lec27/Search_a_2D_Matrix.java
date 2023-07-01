package Lec27;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int [] [] arr = {{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        int target = 31;
        System.out.println(searchMatrixFunc(arr,target));

    }
    public static boolean searchMatrixFunc(int[][] arr, int target) {
        int ri = 0;
        int ci = arr[0].length - 1;

        while (ri < arr.length && ci >= 0) {
            if (arr[ri][ci] == target) {
                return true;
            } else if (arr[ri][ci] < target) {
                ri++;
            } else {
                ci--;
            }
        }

        return false;
    }
}
