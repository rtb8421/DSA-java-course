package Lec6;

public class post_inc {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(a++);//8
        int b = a++;
        System.out.println(b);//10 8
        int c = a;
        b++;
        System.out.println(b);//11 9
        System.out.println(c--);//10 8
        System.out.println(a);//10 9
    }
}
