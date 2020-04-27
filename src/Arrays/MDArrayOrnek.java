package Arrays;

public class MDArrayOrnek {

    public static void main(String[] args) {
        int[][] j = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("  " +j[i][k]);
            }
            System.out.println();
        }


    }
}
