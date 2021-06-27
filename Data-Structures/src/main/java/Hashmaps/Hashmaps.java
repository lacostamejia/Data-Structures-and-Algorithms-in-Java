package Hashmaps;

import java.util.HashMap;


/*Hashmaps does not have an exact order; however, arraylists do have an order
depending to the position.

 */

public class Hashmaps {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 88;

        HashMap <String, Integer> map = new HashMap<String, Integer>();
        map.put("a",10); //Adding values
        map.put("b",3);
        map.put("c",88);

        System.out.println(map);

        System.out.println(map.get("c")); //Getting the value of this key

        map.remove("c");
        System.out.println(map);

        System.out.println(map.containsValue(10)); //Has this value
        System.out.println(map.containsKey("b")); //Has this key.

        System.out.println("The size is " + map.size());

        System.out.println(map.replace("a",20)); //Replace the value of this key
        System.out.println(map);

        System.out.println(map.keySet()); //Prints all the keys
        System.out.println(map.values()); //Prints all the values
    }
}
