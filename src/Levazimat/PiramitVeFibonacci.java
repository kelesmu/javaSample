package Levazimat;

import java.util.Arrays;

public class PiramitVeFibonacci {


    public static void main(String[] args) {
        PiramitVeFibonacci anm=new PiramitVeFibonacci();
       anm.fibonacci();
        anm.tersPiramit();
        anm.piramit();
    }

    public void tersPiramit(){


        int n=10;
        for(int i=0; i<n; i++){

            for(int j=n; j>i ;j--){
                System.out.print(" @ ");

            }


            System.out.println();

        }}

    public void piramit(){


        int n=10;
        for(int i=0; i<n; i++) {

            for (int j =0; j < i; j++) {
                System.out.print(" @ ");
                //System.out.print(j);
            }


            System.out.println();

        }}

            public void arrayornek() {

        int[] a = {1, 2, 3, 4, 5, 6, 7};


        System.out.println(Arrays.toString(a));
    }

    public void fibonacci(){
              //(0, 1, 1, 2, 3 5 8 13 21 34 55 89 144
        int a=0;
        int b=1;
        int c=0;


                for(int i=0; i <11; i++){
                   c=a+b;
                   a=b;
                   b=c;



                }

        System.out.println(c);
    }

    }
