package Lec32;

public class Wrapper_class_intro {
    public static void main(String[] args) {
        Integer a = 10;
        int a1 = 10;
//        System.out.println(a);
//        System.out.println(a1);
//        System.out.println(a1==a);

        a = a1; // primitive to non - primitive ---> Auto Boxing
        a1 = a; // non - primitive to primitive---> UnBoxing

//        System.out.println(a);

        Integer b1 = 10;
        Integer b2 = 10;
        Integer c1 = 200;
        Integer c2 = 200;

        System.out.println(b1 == b2); //  true
        System.out.println(c1 == c2); // false
    }
}
