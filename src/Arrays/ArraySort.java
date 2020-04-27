package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {
        sort();

    }

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


}
