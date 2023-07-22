package Lec36;

public class Find_Index {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,7,8,3,2,11,9};
        int target = 3;
        System.out.println(findFirstOccurence(arr, 0, target));
    }
    public static int findFirstOccurence(int[] arr , int i , int target){
        if(arr[i]==target){
            return i;
        }
        return findFirstOccurence(arr, i+1 , target);
    }
}
