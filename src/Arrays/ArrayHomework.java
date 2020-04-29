package Arrays;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHomework {

    static int age=20;

    public static void main(String[] args) {


        ArrayHomework ah = new ArrayHomework();
        // Answer - 1

        double[] scores = {90, 89, 91, 100, 81, 150, 75, 64};
      String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky", "Palina", "Saten", "Ridh"};
        System.out.println(studentScore(scores, names));

        //Answer - 2

        int[] numbers = {45, 22, 11, 65, 89, 91, 110, 81};
        System.out.println(maxNum(numbers));

        // Answer - 3

        System.out.println(firstLetters( "you neVer WaLK ALONE"));

        //Answer - 4-a
       int[] originalArray= {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
       removeValue(originalArray, 24);

       //Answer - 4-b
        int[] originalArr=     {1, 2, 4, 3, 1, 6, 1};
        removeValue(originalArr, 1);

    }
    /**  QUESTION - 1
         *         double[] scores = {90, 89, 91, 100, 81, 150, 75, 64}; //5
         *         String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky", "palina", "Saten", "Ridh"}; //names[5]
         *         print name of student with maximum score */
         public static String studentScore(double[] scores, String [] names) {
             /*with the help of for loop and if statement will find the biggest number and store the index position
                and fetch the name of the student by using index position.
                and print name and score */
             String studentName;
             int maxNumIndex = 0;
             double value = 0.0;
             for (int i = 0; i < scores.length; i++) {
                 if (scores[i] > value) {
                     value = scores[i];
                     maxNumIndex = i;
                 }
             }
             studentName = names[maxNumIndex];
             return "Student " + studentName + ", get the maximum score of " + value + " at the class";


         }

         /*  QUESTION -2
         *
         *         //int[] numbers = {45, 22, 11, 65, 89, 91, 110, 81};
         *         //print the maximum number in given array
         */
         public static int maxNum(int[] numbers){
             // with enhanced for loop I will check all values and catch the biggest number
            int maxnmb=0;
            for(int number: numbers){
                if(number>maxnmb){
                    maxnmb=number;
                }}
           return maxnmb;
             }


         /*QUESTION - 3
         *         //String statement = "you neVer WaLK ALONE";
         *         //Output: You Never Walk Alone
         *first split sentence by removing spaces
         * than will make arrays first letters capital
         */
         public static String firstLetters(String statement){
            String emptyString="";
           String []  splittedSentence = statement.split(" ");

             for (String word:splittedSentence){
                 emptyString= emptyString+" "+word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

             }
            return emptyString;
         }



          /*   Question - 4:
         *
         *   Create a method using Java to remove a specific value from a given int array.
         *   Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
  *   Returned array: {32, 14, 98, 56, 148, 78}
         *
         *   Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 1
         *   Returned array:  {2, 4, 3, 6}
         *
         * create for loop. and if loop.
     */
          //Once Levazimat.yeni olusturacagimiz Arrayin lenght ini buluyoruz. Bunun icin atacagimiz sayinin kac defa gectigini
    //belirleyip buna gore size i belirliyoruz. Ardindan

          public static void removeValue(int[] originalArray, int toBeRemoved){
              int count=0;
              for (int num: originalArray){
                  if(num==toBeRemoved){
                      count++;
                  }
              }
              int[] newArr= new int[originalArray.length-count];
              int index=0;

              for (int num : originalArray){
                  if(num != toBeRemoved){
                      newArr[index]=num;
                 index++;
                  }
              }

              System.out.println(Arrays.toString(newArr));
          }

}
