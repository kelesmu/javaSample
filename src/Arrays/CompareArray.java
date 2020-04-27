package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArray {

    final static int i=0;


    public static void main(String[] args) {

        compare();
        common();
        sort();
        sort2();
        System.out.println("------------");
        sorttArray();

    }

    /*Question 1:
    Write a method to return the duplicate values (in a List<String>) of an array of string values.
    Example:
        Input String array -> {"hello", "peace", "hello" , "happy", "happy", "grow" , "happy"}
        Method should return -> ["hello", "happy"]
    */
    public static void compare() {
        String[] myArray = {"hello", "peace", "hello", "happy", "happy", "grow", "happy"};
        List<String> myArrList = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i].equalsIgnoreCase(myArray[j])&& ( i!=j) && (!myArrList.contains(myArray[i]))) {

                    myArrList.add(myArray[i]);
                }
            }
        }


        System.out.println(myArrList);
    }
    /*Write a method to return the common elements  (in a List<String>) between two arrays (string values)
Note: Length of input arrays can be different also.
Example:
	Input arrays
	array1 -> {"ab", "abcd", "abc", "abcde", "defg", koli"}
	array2 -> {"abcde", "jhuy", "plot", "koli"}
	Method should return -> ["abcde" , "koli"]*/


    public static void common(){
        List <String> myList= new ArrayList<>();
        String []myarr1= {"ab", "abcd", "abc", "abcde", "defg", "koli"};
        String [] myarr2= {"abcde", "jhuy", "plot", "koli"};
        for (String s : myarr1) {
            for (String value : myarr2) {
                if (s.equalsIgnoreCase(value)) {
                    myList.add(s);
                }
            }
        }
        System.out.println(myList);
    }
// to sort Array
    public static void sort(){
        int index=0;
        Integer [] myArray1={45,32,54,12,14,34,1,3,2};
        //Arrays.sort(myArray1);
        for(int i=0; i<myArray1.length;i++){
            for(int j=i+1; j<myArray1.length; j++){
                if(myArray1[i]> myArray1[j]){
                    int temp=myArray1[i];
                    myArray1[i]=myArray1[j];
                    myArray1[j]=temp;
                }
            }
        }


        System.out.println(Arrays.toString(myArray1));



    }

    public static void sort2(){

        int[] newArr={34,43,23,12,21,46,43,28,26};

        for(int i=0; i<newArr.length;i++){
            for(int j=i+1; j<newArr.length; j++){
                if(newArr[i]> newArr[j]){
                    int temp=newArr[i];
                    newArr[i]=newArr[j];
                    newArr[j]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(newArr));

    }




    public static void sorttArray(){

        Integer [] myArr={45,32,54,12,14,34,1,3,2};

        int temp=0;
        for(int i=0; i<myArr.length-1; i++){

            if(myArr[i]>myArr[i+1]){
                temp=myArr[i];
                myArr[i]=myArr[i+1];
                myArr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(myArr));
    }

























}