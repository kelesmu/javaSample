import java.util.Arrays;

public class ArrayOrnek1 {

    public static void main(String[] args) {


        /*Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
        Now, tell user whether that number is present in array or not.
         */
        int [] arr={3,5,8,9,10,12,33,44,54,65,};
        int num= 28;
        System.out.println(isPresent(arr,num));
        int [] myArr={-45, -3, -5, 3,5,8,9,10,12,33,44,54,65, 80};
        quiz(myArr);

        int [] origArr= {11,32,3,5,8,9,10,12,33,44,};
        arrReverse(origArr);

        doubleArray();

        int[] myArr1= {3,5,8,9,93,33,44,54,65,};
        System.out.println(largestArray(myArr1));
        System.out.println(smallestArray(myArr1));

        System.out.println("-------");
        splitArray();


    }

    public static boolean isPresent(int[] arr, int num){
        boolean res= false;
        for (int i: arr){
            if (i==num){
                res=true;
            break;
            }
        }

        return res;
    }


    /*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/

    public static void quiz(int [] myArr){
        int positive=0;
        int negative=0;
        int odd=0;
        int even=0;
        int zeros=0;



        for (int i=0; i<myArr.length; i++){
            if(myArr[i]<0){
                negative++;

            }
         else {
            positive++;
            }
        if(myArr[i] % 2 == 0){
            even++;
            }
        else {

            odd++;
            }

        if(myArr[i]%10==0){

            zeros++;
            }
        }

        System.out.println(negative+" "+ positive +" "+ even+ " " + odd+ " " +zeros);
    }

  /*  Take 10 integer inputs from user and store them in an array. Now, copy all the elements
  in an another array but in reverse order.
   */
    public static void arrReverse(int[] origArr){
        int count=origArr.length;
        int [] newArr = new int [count];
        for (int i=0; i<origArr.length; i++){
            newArr[count-1]= origArr[i];
            count--;

        }
        System.out.println(Arrays.toString(origArr));
        System.out.println(Arrays.toString(newArr));
        Arrays.sort(origArr);
        System.out.println(Arrays.toString(origArr));
        System.out.println(Arrays.equals(origArr,newArr));

    }
    // Initialize and print all elements of a 2D array.

    public static void doubleArray(){

        int[][] myArr= {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<1; i++){
            for(int j=0; j<3; j++){
                System.out.println(Arrays.toString(myArr[j]));
            }
        }
    }

    public static int largestArray(int[] myArr1){
        int biggest=0;
        int smallest=0;
        for(int i: myArr1){
            if (i>biggest){
                biggest=i;
            }

        }
        return biggest;
    }

    public static int smallestArray(int[] myArr1){

        int smallest=1000;
        for(int i:myArr1){
            if (i< smallest){
                smallest=i;
            }

        }
        return smallest;
    }

    public static void splitArray(){
        int[] tobeSplit= {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};
        int[] firstHalf = new int [5];
        int[] secondHalf = new int [5];
        for(int i:tobeSplit)
        {
            if (i<5){
                firstHalf[i]=tobeSplit[i];
            }

            else{
                secondHalf[i]= tobeSplit[i];
            }
        }
        System.out.println(Arrays.toString(firstHalf));
        System.out.println(Arrays.toString(secondHalf));


    }
}
