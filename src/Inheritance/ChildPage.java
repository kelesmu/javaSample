package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChildPage extends ParentPage{

    static String un = "Ahmet";
    static String [] yenisi = un.split("A");


    int age;
    String name="Ahmet";


    public void childMethod1(){


        System.out.println("This is child method1");
        System.out.println("This is child method1");

        System.out.println(Arrays.toString(yenisi));


    }
ParentPage pp = new ParentPage();

    public void childMethod2(){

        System.out.println("This is child method2");
        super.parentName="asli";  //super keyword ile sadece instance variable ve metodlar cagrilabiliyor.
        ParentPage.a12=23;       //static members can be called by class name not super keyword

    }

    @Override
    public void parentMethod1() {
        super.parentMethod1();
        System.out.println("This is overriden parent Method1");
    }

    @Override
    public void parentMethod2() {
        System.out.println("This is overridden parent method2");
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(yenisi));

        System.out.println("----");

        System.out.println("-----");
        ChildPage c1 = new ChildPage();
        c1.parentMethod1();

        List<Integer> ab = new ArrayList<>();
        ab.add(2);
        ab.add(5);
        ab.add(7);
        ab.add(9);

        Integer[] abArray = ab.toArray(new Integer[0]);
        System.out.println(Arrays.toString(abArray));
    }

        public static boolean isSquare(int n) {



            for(int i=0; i<n/2; i++){
                if(i*i==n){
                    // fix me!
                }}
            return true;
        }
    }

