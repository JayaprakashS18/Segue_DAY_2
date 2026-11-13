
package sequejava;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // 1. Insert elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Orange");

        // 2. Display HashMap
        System.out.println("HashMap: " + map);

        // 3. Get value
        System.out.println("Value of key 2: " + map.get(2));

        // 4. Search key
        System.out.println("Contains key 3: " +
                           map.containsKey(3));

        // 5. Search value
        System.out.println("Contains Mango: " +
                           map.containsValue("Mango"));

        // 6. Remove element
        map.remove(2);

        System.out.println("After removal: " + map);

        // 7. Display size
        System.out.println("Size: " + map.size());

        // 8. Display all keys and values
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // 9. Clear HashMap
        map.clear();

        System.out.println("After clear: " + map);
    }
}
