package Lec6;

public class pre_inc {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(++a);
        int b = 7;
//        int c = a++ + ++a + a + 12 + ++b + 11 + b++ + ++b;
//        System.out.println(c);//59 66

//        int d = a++ + 7 + --a + 9 + ++a + a++;// 54 // 54
//        System.out.println(d);//

        int d = 6;

        int m = a++ + --a + b + 9 + d++ - b++ - 8 + ++a + ++b + a;//53 //53
        System.out.println(m);//54
    }
}
