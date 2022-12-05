import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        System.out.println("Array List Demo");

        // Create an ArrayList object
        ArrayList<String> myList = new ArrayList<String>();

        // Add items to it
        myList.add("apples");
        myList.add("oranges");

        // Loop over and print the items
        for (String item : myList) {
            System.out.println("Item -> " + item);
        }

        // Remove "apples" from this list
        myList.remove("apples");

        // Print the no of items inside the list
        Integer count = myList.size();
        System.out.println(count);
    }

}