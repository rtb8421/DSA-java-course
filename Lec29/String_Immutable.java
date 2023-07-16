package Lec29;

public class String_Immutable {
    public static void main(String[] args) {
        String s1 = "abc";
        s1 += "d";
        System.out.println(s1);
        String s2 = new String("Hello");
        s2 += "bye";
        System.out.println(s2);
    }
}
