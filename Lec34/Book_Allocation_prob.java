package Lec34;

import java.util.Scanner;

public class Book_Allocation_prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int nob = sc.nextInt();
            int nos = sc.nextInt();
            int[] arr = new int[nob];
            for (int i = 0; i < nob; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(readBooks(arr,nos));
            t--;
        }
    }
    public static int readBooks(int[] books , int nos){
        int low = 0;
        int high = 0;
        for (int i = 0; i < books.length; i++) {
            high+=books[i];
        }
        int ans  = 0;
        while(low <= high){
            int mid = (low + high )/ 2;
            if(possibleRead(mid,nos,books)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean possibleRead(int mid, int nos, int[] books) {
        int student = 1;
        int booksPage = 0;
        int i = 0;
        while (i < books.length) {
            if (booksPage + books[i] <= mid) {
                booksPage += books[i];
                i++;
            } else {
                student++;
                booksPage = 0;
            }
            if (student > nos) {
                return false;
            }
        }
        return true;
    }
}
