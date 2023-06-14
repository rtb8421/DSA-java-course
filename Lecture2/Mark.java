package Lecture2;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();

        if(mark>100)
        {
            System.out.println("Invalid Marks");
        }
        else if(mark>=90 && mark<=100)
        {
            System.out.println("A Grade");
        }
        else if(mark>=80 && mark<90)
        {
            System.out.println("B Grade");
        }
        else if(mark>=60 && mark<80)
        {
            System.out.println("C Grade");
        }
        else if(mark>=30 && mark<60)
        {
            System.out.println("D Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
