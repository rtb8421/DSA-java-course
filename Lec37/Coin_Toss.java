package Lec37;

public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        coinToss(n,"");
    }
    public static void coinToss(int tossLeft, String ans)
    {
        if(tossLeft==0)
        {
            System.out.println(ans);
            return;
        }
        coinToss(tossLeft-1,ans+"H");
        coinToss(tossLeft-1,ans+"T");
    }
}
