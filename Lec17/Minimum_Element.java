package Lec17;

public class Minimum_Element {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -9, -3};
//        System.out.println(minEle(arr));
//        System.out.println(minEleIdx(arr));//3 3
        System.out.println(secMinEle(arr));
    }

    public static int minEle(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minEleIdx(int[] arr) {
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int secMinEle(int[] arr) {
        int secMin = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                secMin = min;
                min = arr[i];
            } else if (secMin > arr[i]) {
                secMin = arr[i];
            }
        }
        return secMin;
    }
}