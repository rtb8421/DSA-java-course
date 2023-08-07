package Lec41;

public class Untitled_Coin_Combination {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        int amount = 10;
        makeCoin(arr, amount , "",0);
    }
    public static void makeCoin(int [] arr , int amount , String ans , int last){

        if(amount == 0){
            System.out.println(ans);
            return;
        }

        if(amount < 0){
            return;
        }

        for(int i = last; i < arr.length; i++) {
//            amount = amount - arr[i];
//            makeCoin(arr, amount,ans+arr[i]);
//            amount = amount + arr[i];
            makeCoin(arr, amount - arr[i],ans+arr[i], i);

        }
    }
}
