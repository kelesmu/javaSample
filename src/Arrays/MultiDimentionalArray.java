package Arrays;

import StringAlistirmalari.StringOrnekleri;

public class MultiDimentionalArray {

//print out maximum number from the array
    public static void main(StringOrnekleri[] args) {


        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int max= a[0][0];

        for(int i= 0;i<3;i++){

            for(int j=0; j<3;j++){

                if(a[i][j]>max){

                    max=a[i][j];
                }

            }

        }

        System.out.println(max);
    }


}
