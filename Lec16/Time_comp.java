package Lec16;

public class Time_comp {
    public static void main(String[] args) {

        long start = System.nanoTime();
        for (int i = 0; i < 1_00_000; i++) {

        }
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}