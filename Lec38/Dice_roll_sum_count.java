package Lec38;

public class Dice_roll_sum_count {
    public static void main(String[] args) {
        int face = 3;
        int sum = 4;
        System.out.println(possibleWay(0,sum,""));
    }
    public static int possibleWay(int count , int sum , String ans){

        if(count == sum){
            System.out.println(ans);
            return 1;
        }

        if(count > sum){
            return 0;
        }

//        int a = possibleWay(count+1,sum,ans+1);//string + int = string
//        int b = possibleWay(count+2,sum,ans+2);//string + int = string
//        int c = possibleWay(count+3,sum,ans+3);//string + int = string
        int a1 = 0;
        for (int dice = 1; dice <=3; dice++) {
            a1 += possibleWay(count+dice,sum,ans+dice);//string + int = string
        }
        return a1;
//        return a+b+c;

    }
}
