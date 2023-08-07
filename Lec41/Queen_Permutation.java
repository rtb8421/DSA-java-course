package Lec41;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean [] track = new boolean[n];
        printPermutation(track,tq,0,"");
    }
    public static void printPermutation(boolean [] track , int tq , int qpsf , String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < track.length; i++) {
            if(track[i]==false){
                track[i] = true;
                printPermutation(track,tq,qpsf+1,ans+" "+"b"+i+"q"+qpsf);
                track[i] = false;
            }
        }
    }
}
