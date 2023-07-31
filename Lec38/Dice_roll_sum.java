package Lec38;

public class Dice_roll_sum {
    public static void main(String[] args) {
        int face = 3;
        int sum = 4;
        Possibleway(0,sum," ");

    }

    public static void Possibleway(int count, int sum, String ans) {
        if (count == sum) {
            System.out.println(ans);
            return;
        }
        if (count > sum) {
            return;
        }
        Possibleway(count + 1, sum, ans + 1);
        Possibleway(count + 2, sum, ans + 2);
        Possibleway(count + 3, sum, ans + 3);
    }
}
