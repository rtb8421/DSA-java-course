package Lec40;

public class Tower_of_hannoi {
    public static void main(String[] args) {
        int n = 2;
        String src = "A";
        String hlp = "B";
        String dst = "C";
        TOH(n,src,hlp,dst);
    }
    public static void TOH(int n , String src , String hlp, String dst){

        if(n==0){
            return;
        }

        TOH(n-1,src, dst, hlp);
        System.out.printf("Move %d from %s to %s \n", n,src,dst);
        TOH(n-1,hlp,src, dst);

    }
}
