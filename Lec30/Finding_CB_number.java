package Lec30;

import java.util.Scanner;

public class Finding_CB_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(cbNumber(str));
    }
    public static int cbNumber(String str){
        int count = 0;
        boolean [] isVisited = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length() ; j++) {
                int i = j - len;
                String s = str.substring(i,j);
//                int i = Integer.parseInt(s); // string -> int
//                long l = Long.parseLong(s); //string -> long
                long subNum = Long.parseLong(s);
                if(isVisited(isVisited,i,j-1)==true && isCbNumber(subNum)==true){
                    count++;
                    for (int k = i; k < j; k++) {
                        isVisited[k] = true;
                    }
                }
            }
        }
        return count;
    }
    public static boolean isVisited(boolean [] arr, int i , int j ){
        for (int k = i; k <= j; k++) {
            if(arr[k]==true){
                return false;
            }
        }
        return true;
    }

    public static boolean isCbNumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
