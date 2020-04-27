package Collections;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtraPage {

    public static void main(String[] args) {


        List<String> strList=new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Durmus", "Hasan", "Huseyin"));
        List<String> strList1=new ArrayList<>(Arrays.asList("Mehmet", "Ahmet", "Durmus", "Hasan", "Huseyin"));
        Collections.sort(strList);
        Collections.sort(strList1);

       // strList.add("Veli");
        System.out.println(strList);


        List<Integer> myList= new ArrayList<>();
        myList.add(33);
        myList.add(45);
        myList.add(22);
        myList.add(24);
        myList.add(43);
        myList.add(87);

        System.out.println(strList.equals(strList1));
      //  myList.sort();

        List<Integer> myList1=new ArrayList<>(Arrays.asList(43,44,56,58,59,68));
        boolean k=true;

        System.out.println("If list is equal: " + myList.equals(myList1));

        for(int i=0; i<myList1.size()-1; i++){
           int t= myList1.get(i);
           int s= myList1.get(i+1);

            if (t>s){

                k=false;
                break;
            }

        }
        Assert.assertTrue(k);

        System.out.println("ArrayList ascending: "+ k);


        }


    }
