package Lec29;

public class libraries_string {
    public static void main(String[] args) {
        String s = "OnePunchMyHeroAcademia";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        String s1 = new String("One");
        String s2 = new String("One");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        String a = "Raj";
        String b = "Raju";
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(b));
        System.out.println(s.substring(3));
        System.out.println(s.substring(3, 8));

    }
}