package Lec10;

public class Character {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c);

        char c1 = '0';
        System.out.println(c1);

        char c2 = 'अ';
        System.out.println(c2);

        char c3 = 'ଔ';
        System.out.println(c3);

//        int i = c3;
        System.out.println((int)c3);

//        int i1 = 2822;
//        char c4 = (char) i1;
//        System.out.println(c4);

        int i = 3000;
        System.out.println((char)i);

        int i1 = 2836;
        System.out.println((char)i1);

        char c7 = 'a';
        c7++;
        System.out.println(c7);

        int i2 = (c7 + 1);
        System.out.println(i2);

        c7 += 1;
        System.out.println(c7);

    }
}

