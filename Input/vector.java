package Input;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Create a Vector and add elements
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grapes");

        // Convert Vector to an array
        String[] array = new String[vector.size()];
        vector.copyInto(array);

        // Display the elements of the array
        System.out.println("Elements in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
