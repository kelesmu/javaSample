package Collections;

import Constructor.MainPage;

import java.util.*;


public class HashSetSample {

    public static void main(String[] args) {
        Set<Integer> mySet= new HashSet<>();
        List<Integer> myList = new ArrayList<>(10);
        myList.add(4);



        int[] myArr= {1,3,2,4,3,2,6,5};

        for (int i: myArr){

            mySet.add(i);
        }
        mySet.add(22);
        mySet.add(19);
        mySet.remove(2);
        mySet.remove(5);
        System.out.println(mySet);
        System.out.println(mySet.contains(6));
        System.out.println( mySet.containsAll(mySet));
        mySet.addAll(myList);
        myList.add(0,3);
        System.out.println(myList.get(0));


        //converting set to array.
      // Object [] newArr= mySet.toArray();
       // System.out.println(Arrays.toString(newArr));
        List<Integer> arrList= List.copyOf(mySet);

        System.out.println(arrList);

        Set<Integer> newSet= Set.copyOf(arrList);
        System.out.println(arrList);

        List<Integer> newList= new ArrayList<>(newSet);
        System.out.println(newList);






    }



}
