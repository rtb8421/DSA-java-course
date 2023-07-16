package Lec32;
import java.util.*;
public class Arraylist_intro {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(a);
        System.out.println(a.size());
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        a.add(1, -5);
        System.out.println(a);

//        a.add(10,100);
//        System.out.println(a);

        System.out.println(a.size()); // 4

        //remove
        System.out.println(a.remove(1));
        System.out.println(a);

        //update
        a.add(1, -5);
        a.set(1, 40);
        System.out.println(a);

        //sort
        Collections.sort(a);
        System.out.println(a);

        //reverse sort
        Collections.reverse(a);
        System.out.println(a);

        //get value
        System.out.println(a.get(1));

        //Display
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        int[] arr = {3, 5, 7, 9};
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
