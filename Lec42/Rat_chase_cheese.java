package Lec42;
import java.util.*;

public class Rat_chase_cheese {
    static boolean flag ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[] [] ans = new int[n][m];
        ratPath(maze,0,0,ans);
        if(flag==false){
            System.out.println("NO PATH FOUND");
        }
    }

    public static void ratPath(char[][] maze , int cc , int cr, int[][] ans){

        if(cc==maze[0].length-1 && cr==maze.length-1 && maze[cr][cc] == 'O'){
            ans[cr][cc] = 1;
            Display(ans);
            flag = true;
            System.out.println();
            return;
        }

        if(cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc]=='X'){
            return;
        }

        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        ratPath(maze,cc+1,cr,ans);
        ratPath(maze,cc-1,cr,ans);
        ratPath(maze,cc,cr+1,ans);
        ratPath(maze,cc,cr-1,ans);
        ans[cr][cc] = 0;
        maze[cr][cc] = 'O';

    }

    public static void Display(int[] [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
