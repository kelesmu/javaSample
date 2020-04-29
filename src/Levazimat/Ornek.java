package Levazimat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ornek {


    public static void main(String[] args) {
        maxNum();
        minNum();
        abbrev();
        numbWord();
        reversingArray();
        followingChar();
        multiply();

    }

    // Int [] arr= {33,44,88,93,65};
    // Find the max and min number

    public static void maxNum() {
        int[] arr = {33, 44, 88, 93, 65};
        int maxNumber = 0;
        for (int i : arr) {
            if (i > maxNumber) {
                maxNumber = i;
            }

        }
        System.out.println(maxNumber);
    }

    public static void minNum() {
        int[] arr = {33, 44, 88, 93, 65};
        int minNumb = arr[0];
        for (int i : arr) {
            if (i < minNumb) {
                minNumb = i;
            }
        }
        System.out.println(minNumb);
    }

    // - String name= “In Java we have already defined exception classes such as ArithmeticException”
    // Write a java program to print abbreviations.

    public static void abbrev() {
        String sentence = "In Java we have already defined exception classes such as ArithmeticException";
        String abbv = "";
        String[] wordArr = sentence.split(" ");
        for (String str : wordArr) {
            abbv = abbv + str.toUpperCase().charAt(0);
        }

        System.out.println(abbv);
    }

    //3- sum the number of words in above string
    public static void numbWord() {
        String sentence = "In Java we have already defined exception classes such as ArithmeticException";

        String[] words = sentence.split(" ");
        System.out.println(words.length);
    }

//4- Take 10 integer inputs from user and store them in an array. Now, copy all the elements
    //  in an another array but in reverse order.


    public static void reversingArray() {
        int[] arr = {33, 44, 88, 93, 65, 68, 73, 55, 12, 7};


        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    /*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    //
    //doubleX("axxbb") → true
    //doubleX("axaxax") → false
    //doubleX("xxxxx") → true
*/
    public static void followingChar() {

        boolean res = true;
        String name = "kirikkale";
        int index = 0;
        char ch = name.charAt(0);
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == name.charAt(i + 1)) {
                index = i;
                ch = name.charAt(i);

            }
        }
        for (int i = 0; i < index; i++) {
            if (name.charAt(i) == ch) {

                res = false;
                break;


            }


        }
        System.out.println(res);


    }

    public static void multiply() {
        List<Integer> mylist = Arrays.asList(3, 5, 7, 9);
        List<Integer> newList=new ArrayList<>();
       // System.out.println(mylist);
        for(Integer i:mylist){
            newList.add(i*i);
        }
        System.out.println(newList);

    }
}
