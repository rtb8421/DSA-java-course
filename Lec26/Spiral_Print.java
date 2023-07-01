package Lec26;

public class Spiral_Print {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        spiralMatrix(arr);
    }
    public static void spiralMatrix(int[][] arr) {
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;

        while (minC <= maxC && minR <= maxR) {
            for (int i = minC; i <= maxC && minC <= maxC && minR <= maxR; i++) {
                System.out.print(arr[minR][i] + " ");
            }
            minR++;
            for (int i = minR; i <= maxR && minC <= maxC && minR <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");
            }
            maxC--;
            for (int i = maxC; i >= minC && minC <= maxC && minR <= maxR; i--) {
                System.out.print(arr[maxR][i] + " ");
            }
            maxR--;
            for (int i = maxR; i >= minR && minC <= maxC && minR <= maxR; i--) {
                System.out.print(arr[i][minC] + " ");
            }
            minC++;
        }
    }
}
