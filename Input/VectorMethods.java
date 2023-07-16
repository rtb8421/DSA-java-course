package Input;
import java.util.*;
public class VectorMethods {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();

        // Adding elements to the Vector using addElement(item)
        list.addElement("Item 1");
        list.addElement("Item 2");
        list.addElement("Item 3");

        // Accessing elements in the Vector using elementAt(index)
        String elementAt10 = list.elementAt(1);
        System.out.println("Element at index 1: " + elementAt10);

        // Getting the size of the Vector using size()
        int size = list.size();
        System.out.println("Size of the Vector: " + size);

        // Removing an element from the Vector using removeElement(item)
        boolean removed = list.removeElement("Item 2");
        System.out.println("Item 2 removed: " + removed);

        // Removing an element at a specific index using removeElementAt(n)
        int indexToRemove = 0;
        list.removeElementAt(indexToRemove);
        System.out.println("Element at index " + indexToRemove + " removed.");

        // Removing all elements from the Vector using removeAllElements()
        list.removeAllElements();
        System.out.println("All elements removed from the Vector.");

        // Copying elements from the Vector to an array using copyInto(array)
        list.addElement("Item A");
        list.addElement("Item B");
        list.addElement("Item C");
        String[] array = new String[list.size()];
        list.copyInto(array);
        System.out.println("Elements copied into the array:");
        for (String element : array) {
            System.out.println(element);
        }

        // Inserting an element at a specific index using insertElementAt(item, n)
        int indexToInsert = 1;
        String itemToInsert = "New Item";
        list.insertElementAt(itemToInsert, indexToInsert);
        System.out.println("Element '" + itemToInsert + "' inserted at index " + indexToInsert +".");
    }
}

