public class Pyramit {



        public static void main (String []args){



            int[][] pyramid = new int[11][11];
            for(int i=0; i<11; i++) {
                for(int j=10; j>i;j--) {
                    System.out.printf("@ ", pyramid[i][j]);
                }
        
                System.out.println();
            }



        }
}

