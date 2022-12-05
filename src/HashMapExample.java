import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args) {

        // Key / value type
        // String, Integer

        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        // Hashmap of arrays
        HashMap<String, ArrayList<String>> userMap = new HashMap<String, ArrayList<String>>();

        userMap.put("bala", new ArrayList<String>());
        userMap.put("fred", new ArrayList<String>());
        userMap.put("ken", new ArrayList<String>());

        // add a key, value pair to it

        myMap.put("bala", 30);
        myMap.put("ken", 40);

        String key = "bala";
        System.out.println("Value for key = " + key + " -> " + myMap.get(key));

        myMap.put("bala", 31);
        System.out.println("New value for key = " + key + " -> " + myMap.get(key));

        // check if a key exist in map
        System.out.println("check if fred exists: " + myMap.containsKey("fred"));
    }

}
