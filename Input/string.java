package Input;
public class string {
    public static void main(String[] args) {
        String s1 = "Rohan Patel";
        String s2 = s1.toUpperCase();
        String s3 = s2.toLowerCase();

        System.out.println(s2 + "\n" + s3);
        System.out.println(s1.replace('e', 'a'));

        String s4 = "RTB";
        System.out.println("Length of s4 =" +s4.length() + "\n length of trimmed s4 = " + s4.trim().length());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("Character at 6th index is :" + s1.charAt(6));
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.concat(s1));
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(0, 5));

        Object object = null;
        Object object1 = object;
        int ob = 31;

        System.out.println("after using value()" + ob + "belongs to =" + String.valueOf(ob).getClass());
        System.out.println(s1.indexOf("n"));
        System.out.println(s1.indexOf('n', 6));
    }
}

