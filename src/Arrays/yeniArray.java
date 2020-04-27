package Arrays;

import java.util.Arrays;

public class yeniArray {


    public static void main(String[] args) {
        System.out.println(maxScore());
    }


    public static String maxScore() {
        double[] scores = {90, 89, 91, 100, 81, 150, 75, 64};
        String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky", "palina", "Saten", "Ridh"};

        double max = 0;
        String name = "";

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > max) {
            max=scores[i];
                name = names[i];
            }
        }
        return name;
    }

}