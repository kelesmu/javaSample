package Arrays;

import java.util.*;

public class ArrayOrnekleri {


    static Integer[] myArray1 = {45, 32, 54, 12, 12, 1, 3, 14, 34, 1, 3, 2};
    static List<Integer> myInt = Arrays.asList(4,5,678);
    static List<Integer> secondInt = new ArrayList<>();

    static Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray1));

    static List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));

   // static Map <Integer, String> myMap = new HashMap<>();




    public static void anything() {

        Collections.addAll(secondInt, 1, 2, 3, 4, 5, 6);
        Collections.addAll(mySet, 45, 65);
        System.out.println("set= "+ mySet);
        System.out.println(mySet.contains(65));

        Map<Integer, String> myMap = new HashMap<>();



        // to add values in map
        myMap.put(1, "One"); // 1, "happy"
        myMap.put(2, "two");
        myMap.put(3, "three");
        myMap.put(4, "four");

        // to print HashMap
        System.out.println("map= " + myMap);



        mySet.clear();
        System.out.println(mySet);
        Collections.sort(myInt);
        Collections.reverse(myInt);
        // myInt.remove(0);

        System.out.println(myInt);
        System.out.println(myInt.size());
        System.out.println(secondInt);
        myList.clear();
        System.out.println(myList);


    }

    public static void main(String[] args) {
        anything();
        //myInt.clear();
    }
}
