package Lec35;

public class Print_Reverse {
    public static void main(String[] args) {
        int n = 5;
        printReverse(n);
    }
    public static int printReverse(int n ){
        if(n==0){
            return 0;
        }

        System.out.println(n);
        return printReverse(n-1);
    }
}
