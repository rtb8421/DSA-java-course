package Lec35;

public class Print_sequence {
    public static void main(String[] args) {
        int n = 5;
        printSequece1(n);
    }
    public static void printSequece1(int n ){
        if(n==0){
            return;
        }

        printSequece1(n-1);
        System.out.println(n);
    }
}
