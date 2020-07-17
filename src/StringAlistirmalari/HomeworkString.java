package StringAlistirmalari;

import org.junit.Test;

import java.util.Arrays;

public class HomeworkString {



    public static void main(String[] args) {


        HomeworkString hw = new HomeworkString();

        hw.convert("1.1%");
        System.out.println(hw.sumInt());
        System.out.println(hw.isPrimenum(20));
        System.out.println(hw.isPrimenum(17));
        System.out.println(hw.averageOfArray());
        System.out.println(hw.averageOfArray2());
        System.out.println(hw.isPalindrome("racecar"));
        System.out.println(hw.isPalindrome("laugh"));
        System.out.println(hw.abbreviation("Outfit of the day"));
        System.out.println(hw.abbreviation("Happy new year"));
        System.out.println(hw.searchItem1("Cake"));
        hw.searchName("philip");


    }

    public void convert(String value) {

       if (value.contains(".")){
          // double doubleValue = Double.parseDouble(value.substring(0,value.length()-1));
        double doubleValue = Double.parseDouble(value.replace("%",""));
           System.out.println(doubleValue);
       }
       else {
         int newValue=  Integer.valueOf(value.replace("%",""));
           System.out.println(newValue);
       }


        /**
         * write code to convert value into double or integer depending upon the string-value
         */
    }
    /**
     * Question-1
     * Create a method to sum all the numbers in an int-array.
     * Example:
     * Input to method: {11, 32, 54, 15, 20}  Method should return: 132
     */

    public int sumInt() {
        int sum = 0;
        int[] myArr = {11, 32, 54, 15, 20};
        for (int num: myArr) {
            sum = sum + num;
        }
        return sum;
    }

    /*     *
     * Question-2
     * Create a method to verify if the input-int-number is prime or not
     * 	Example 1:
     * 		Input to method: 20
     * 		Method should return: false
     * 	Example 2:
     * 		Input to method: 17
     * 		Method should return: true*/


    public boolean isPrimenum(int num) {
        boolean isPrime = false;


        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }

    /*
     *
     * Question-3-4
     * Create a method to find average of a given int-array
     * 	Example 1:
     * 		Input to method: {11, 43, 56, 77, 101, 27, 64}
     * 		Method should return: 54.142
     * 	Example 2:
     * 		Input to method: {78, 34, 109, 59}
     * 		Method should return: 70.0
     */
    public double averageOfArray() {
        int [] arr2 = {11, 43, 56, 77, 101, 27, 64};
        double sum = 0.0;
        for (int i : arr2) {
            sum = sum + i;
        }

        String a="abc";


        return sum / arr2.length;




    }

    public double averageOfArray2() {
        int[] arr2 = {78, 34, 109, 59};
        double sum = 0.0;

        for (int i: arr2) {
            sum = sum + i;
        }
        return  sum / arr2.length;
    }
    /*
     * Question-5 Create a method to find if given string is palindrome.
     * [Palindrome means, String reads same way even when reads backwards]
     * 	Example 1:
     * 		Input to method: "racecar"
     * 		Method should return: true
     * 	Example 2:
     * 		Input to method: "laugh"
     *         Method should return: false  */

    public boolean isPalindrome(String name) {
        StringBuilder reverseName = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName.append(name.charAt(i));
        }
        //System.out.println(reverseName);
        return name.equalsIgnoreCase(reverseName.toString());
    }

    /*
     * Question-6:
     *         // create abbreviation
     *         // String msg = "Outfit of the day"; //Good morning OR Happy new year
     *         //Expected: OOTD //GM OR HNY*/

    public String abbreviation(String sentence) {
        StringBuilder abbr = new StringBuilder();
        String[] splittedtext = sentence.split(" ");

        for (String text : splittedtext) {
            abbr.append(text.toUpperCase().charAt(0));
        }
        return abbr.toString();

    }





    /*
     * Question-7:
     *         // String searchItem = "milk"
     *         // Aisle 1: milk, eggs, bread
     *         // Aisle 2: cookies, cake, candy
     *         // Aisle 3: oranges, apple, grapes
     *         // Aisle 4: soft drink, juice, water
     *         // Aisle 5: clothes, electronics, household*/

    public void searchItem(String searchItm) {

        String[] Aisle1 = {"milk", "eggs", "bread"};
        String[] Aisle2 = {"cookies", "cake", "candy"};
        String[] Aisle3 = {"oranges", "apple", "grapes"};
        String[] Aisle4 = {"soft drink", "juice", "water"};
        String[] Aisle5 = {"clothes", "electronics", "household"};

        if (Arrays.asList(Aisle1).contains(searchItm)) {
            System.out.println(searchItm + " is in 1. Aisle");
        } else if (Arrays.asList(Aisle2).contains(searchItm)) {
            System.out.println(searchItm + " is in 2. Aisle");
        } else if (Arrays.asList(Aisle3).contains(searchItm)) {
            System.out.println(searchItm + " is in 3. Aisle");
        } else if (Arrays.asList(Aisle4).contains(searchItm)) {
            System.out.println(searchItm + " is in 4. Aisle");
        } else if (Arrays.asList(Aisle5).contains(searchItm)) {
            System.out.println(searchItm + " is in 5. Aisle");
        } else {
            System.out.println("");
        }
    }

    public static String searchItem1(String item) { //MilK
        String aisleValue = "";
        switch(item.toLowerCase()) {
            case "milk":
            case "eggs":
            case "bread":
                aisleValue = item.toLowerCase() + " is in Aisle 1";
                break;
            case "cookies":
            case "cake":
            case "candy":
                aisleValue = item.toLowerCase() + " is in Aisle 2";
                break;
            case "oranges":
            case "apple":
            case "grapes":
                aisleValue = item.toLowerCase() + " is in Aisle 3";
                break;
            case "soft drink":
            case "juice":
            case "water":
                aisleValue = item.toLowerCase() + " is in Aisle 4";
                break;
            case "clothes":
            case "electronics":
            case "household":
                aisleValue = item.toLowerCase() + " is in Aisle 5";
                break;
            default:
                aisleValue = item.toLowerCase() + " not present";
        }
        return aisleValue;
    }







    /*
     * Question-8:
     *      //String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
     *      //String nameToSearch = "philip";
     *      //If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
     */

    public void searchName(String name){
        String[] names= {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"};
        int j=0;
        for (int i=0; i<names.length; i++){
           if (names[i].equalsIgnoreCase(name))
           {
               System.out.println(i);}

           }
       // else{
         //   System.out.println("name not present");
        }
    }


