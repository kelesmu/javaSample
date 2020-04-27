package Arrays;

public class MDiementional_Array {



        public static void main(String [] args) {


            int a[][] = {{6, 12, 34, 33}, {44, 32, 70, 21}, {64, 55, 43,23}};
            int max= a[0][0];
            int min=a[2][2];



            for (int i=0;i<3;i++){

                for (int j=0; j<4;j++){

                    if (a[i][j]> max){
                        max=a[i][j];}
                        if (a[i][j]<min){
                            min=a[i][j];
                        } }

                }
            System.out.println(max);
            System.out.println(min);
        }}



