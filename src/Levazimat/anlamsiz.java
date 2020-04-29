package Levazimat;

import java.util.Arrays;
import java.util.HashMap;

public class anlamsiz {


    public static void main (String[] args) {

        System.out.println(isPrime(23));

        System.out.println(arrAverage());

int[] originalArray={32, 22, 24, 33, 24, 33, 148, 24, 33, 24};
int tobeRemoved= 24;
arrRemove(originalArray,tobeRemoved);
        System.out.println(ters("Zekavet"));
        searchItem("Juice");
        System.out.println(isPalindrome("racecar"));
    }


    /*   Question - 4:
     *
     *   Create a method using Java to remove a specific value from a given int array.
     *   Original array: {32, 22, 24, 33, 24, 33, 148, 24, 33, 24}    Remove: 33
     *   Returned array: {32, 14, 98, 56, 148, 78}
     *
     *   Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 1
     *   Returned array:  {2, 4, 3, 6}
     */
    public static void arrRemove(int[] originalNumbers, int toBeRemoved){
        //Levazimat.yeni olusturulacak arrayin size ini bulmak icin cikarilacak sayinin kac defa gectigini buluyoruz
        //daha sonra Levazimat.yeni arrayi normali-targetCount olarak olusturuyoruz.
        //sonra target disindaki degerleri Levazimat.yeni arraya koyuyoruz.
        int count=0;
        for (int i:originalNumbers){
            if(i==toBeRemoved){
                count++;
            }
        }
        int index=0;
        int [] newArr= new int[originalNumbers.length-count];
        for(int i : originalNumbers){
            if(i!= toBeRemoved){

                newArr[index]=i;
                index++;

            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static String ters(String name){
        String reversedName="";
        for (int i=name.length()-1; i>=0; i--){
            reversedName= reversedName+ name.charAt(i);

        }

        return reversedName.toLowerCase();
    }

   /* Question-7:
            *         // String searchItem = "milk"
            *         // Aisle 1: milk, eggs, bread
            *         // Aisle 2: cookies, cake, candy
            *         // Aisle 3: oranges, apple, grapes
            *         // Aisle 4: soft drink, juice, water
            *         // Aisle 5: clothes, electronics, household*/

   public static void searchItem(String item){


       switch (item.toLowerCase()){

           case "milk":
           case "egges":
           case "bread":
               System.out.println(item+ " is in aisle -1");
               break;

           case "cookies":
           case "cake":
           case "candy":
               System.out.println(item + " is in aisle -2");
               break;

           case "oranges":
           case "apple":
           case "grapes":
               System.out.println(item + " is in aisle -3");
               break;

           case "soft derink":
           case "juice":
           case "water":
               System.out.println(item + " is in aisle -4");
               break;

           case "clothes":
           case "electronics":
           case "household":
               System.out.println(item + " is in aisle -5");
               break;

           default:
               System.out.println("Item is not present");
       }


   }

    /* Question-5 Create a method to find if given string is palindrome.
            * [Palindrome means, String reads same way even when reads backwards]
            * 	Example 1:
            * 		Input to method: "racecar"
            * 		Method should return: true
            * 	Example 2:
            * 		Input to method: "laugh"
            *         Method should return: false  */

    public static boolean isPalindrome(String name){
       boolean res=false;
       String reversedName= "";
        for(int i=name.length()-1; i>=0;i --){
            reversedName= reversedName+ name.charAt(i);
        }
        System.out.println(reversedName);
        if (reversedName.equalsIgnoreCase(name)) {
            res = true;
        }
       // System.out.println(res);
        return res;
    }



  /*  Question-3-4
            * Create a method to find average of a given int-array
     * 	Example 1:
            * 		Input to method: {11, 43, 56, 77, 101, 27, 64}
     * 		Method should return: 54.142
            * 	Example 2:
            * 		Input to method: {78, 34, 109, 59}
     * 		Method should return: 70.0 */

  public static double arrAverage(){
      double res=0.0;
      double sum=0.0;
      int[] givenArray={11, 43, 45, 33, 1022, 27, 64};
      for(int i:givenArray){
          sum=sum+i;

      }
      res=sum/givenArray.length;


      return res;
  }

   /* Question-2
            * Create a method to verify if the input-int-number is prime or not
     * 	Example 1:
            * 		Input to method: 20
            * 		Method should return: false
            * 	Example 2:
            * 		Input to method: 17
            * 		Method should return: true*/

   public static boolean isPrime(int num){
       //sadece 1 ve kendisine bolunebilen sayi.
       //
       boolean res= true;


       for(int i=2; i<num; i++)
       if(num % i==0){
           System.out.println("its not prime number");
           res= false;
 break;

       }

       return res;
   }

}