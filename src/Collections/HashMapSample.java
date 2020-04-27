package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {

        Map<Integer, String> myMap= new HashMap<>();

        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3,"three");
        //duplicate key is not acceptable
        myMap.put(4,"four");
        myMap.put(4,"five");
        //myMap.put(4,"Antalya");



        System.out.println(myMap.size());
        System.out.println( myMap.containsKey(2));
        System.out.println(myMap.containsValue("five"));
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());

        System.out.println(myMap.get(3));

        System.out.println(myMap.containsKey(5));
        System.out.println(myMap.remove(3));
        System.out.println(myMap.remove(2,"two"));




    }


}
