package Lec35;

public class Power_Recursion {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(powerRecursion(a,b));
    }
    public static int powerRecursion(int a , int b) {
        if (b == 0) {
            return 1;
        }

        int val = powerRecursion(a, b - 1);
        return val * a;
    }
}
