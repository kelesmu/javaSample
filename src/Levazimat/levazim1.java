package Levazimat;

import Collections.ArrayListSample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import static java.lang.StrictMath.sqrt;
import static java.lang.String.valueOf;

public class levazim1 {


    public static void main(String args[]) {
        int num = 100;
        double result = Math.sqrt(num);
        System.out.println("Square root of the number: " + result);

        valueOf(2.3f);

        List<Integer> newlist = new ArrayList<>();


        int[] numbers = {45, 22, 11, 65, 89, 91, 110, 81};
    sortArray(numbers);
        // Create a method using Java to remove a specific value from a given int array.
      int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
      int remove = 24;
        removeElement(array,remove);
    }


    public static void sortArray(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp; } } }
        System.out.println(Arrays.toString(numbers)); }

   /* Create a method using Java to remove a specific value from a given int array.
            *   Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
            *   Returned array: {32, 14, 98, 56, 148, 78} */
        public static void removeElement(int [] myArr, int toBeRemoved){
            int count=0;
            for(int i=0; i< myArr.length; i++){
                if (myArr[i] != toBeRemoved){
                    count++; }
            }
            int[] lastArr = new int[count];
            int index=0;
        for(int i=0; i<myArr.length; i++){
            if(myArr[i]!=toBeRemoved){
                lastArr[index]= myArr[i];
                index++;
            }}
            System.out.println(Arrays.toString(lastArr));
        }
}

