package Lec39;

public class Maze_board_path {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        mazeBoard(0,0,n-1,m-1,"");
    }
    //    current row -->cr
    //    current col -->cc
    //    max row -->mr
    //    max col -->mc


    public static void mazeBoard(int cc, int cr ,int mr , int mc , String ans){

        if(cr==mr && cc == mc){
            System.out.println(ans);
            return;
        }

        if(cr>mr || cc>mc){
            return;
        }

        mazeBoard(cc+1,cr,mr,mc, ans+"V");
        mazeBoard(cc,cr+1,mr,mc, ans+"H");

    }
}
