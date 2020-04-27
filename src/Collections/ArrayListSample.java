package Collections;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSample {

    static ArrayList<Integer> aList = new ArrayList<>();

    public static void main(String[] args) {
       // ArrayListSample.convertArrtoArrList();
        ArrayListSample.isSorted();
        ArrayListSample.deneme();

    }


    //Declaring arraylist
    public static void declareArrList() {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        List<Integer> intList = new ArrayList<>();
        aList.add(5);
        aList.add(3);
    }
    //Convert Array to ArrayList

    public static void convertArrtoArrList() {
        Integer[] myIntarr = {12, 99, 33, 44, 55, 22, 45, 66, 77, 88};
        //Convert Array to ArrayList
        Collections.addAll(aList, myIntarr);
        System.out.println("My alist: " + aList);

        Integer[] myIntArr = {42, 87, 67, 47, 0, 47, 42};
        List<Integer> myIntArrList = new ArrayList<>();
        Collections.addAll(myIntArrList, myIntArr);
        System.out.println("Converted Arraylist" + myIntArrList);

        System.out.println("value at index 4: " + myIntArrList.get(4));
        System.out.println("first index of 42: " + myIntArrList.indexOf(42));
        System.out.println("last index of 42: " + myIntArrList.lastIndexOf(42));
        System.out.println("If my list contains 34: " + myIntArrList.contains(34));
        //to replace value at certain index
        System.out.println("replace value of index 3: " + myIntArrList.set(3, 444));
        System.out.println(myIntArrList);

        // for(int i: myIntArr){
        //     myIntArrList.add(i); }    This is second method.

        System.out.println("=====");
        List<Integer> aList2 = new ArrayList<>(Arrays.asList(myIntarr));
        System.out.println(aList2.size());
        System.out.println(aList2);
        Collections.sort(aList2);
        System.out.println(aList2);

        System.out.println("------");

        //convert ArrayList to Array(method-1)
        Object[] newList = aList2.toArray();
        System.out.println(Arrays.toString(newList));

        // Integer[] abArray = aList2.toArray(new Integer[0]);
        //System.out.println(Arrays.toString(abArray));

        //convert ArrayList to Array(method-2)
        Integer[] arr = new Integer[aList.size()];
        arr = aList.toArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    // to check if ArrayList sorted
    public static void isSorted() {

        List<Integer> myList1 = new ArrayList<>(Arrays.asList(43, 44, 56, 58, 59, 68));
        boolean k = true;

        for (int i = 0; i < myList1.size() - 1; i++) {
            int t = myList1.get(i);
            int s = myList1.get(i + 1);

            if (t > s) {
                k = false;
                break;
            }
        }
        Assert.assertTrue(k);


    }

    public static void deneme() {
        ArrayList<Integer> myList1 = new ArrayList<>(Arrays.asList(16, 18, 19, 56, 58, 59, 68));
        boolean boo = false;
        for (int i = 0; i < myList1.size() - 1; i++) {
            if (myList1.get(i) > myList1.get(i + 1)) {
                System.out.println(boo);
                break;
            } else {
                System.out.println(!boo);
            }


        }
    }
}