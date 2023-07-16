package Lec30;

public class Print_Substring {
    public static void main(String[] args) {
        String str = "Inception";
        printStr(str);
    }
    public static void printStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                System.out.println(s);
            }
        }
    }
}
