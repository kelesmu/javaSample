package Arrays;

import java.util.Arrays;

public class yeniArray {


    public static void main(String[] args) {
        System.out.println(maxScore());
        System.out.println(coded());
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
    public static int maxTriple(int[] nums) {

        int max;

        if(nums[0] > nums[nums.length-1] && nums[0] > nums[(nums.length-1)/2+1]){
            max= nums[0];
        }

        else if(nums[(nums.length-1)/2+1] > nums[nums.length-1] &&
                nums[(nums.length-1)/2+1] > nums[0]){
            max= nums[(nums.length-1)/2+1];
        }
        else
            max= nums[nums.length-1];

        return max;
    }

    public static String coded(){
        String word= "deneme";
        char temp='a';
        String newWord= "";
        char [] alphabet = {'a','b','c','d','e','f','g','h','i', 'j', 'k', 'l','m','n','o','p',
                'q','r','s','t','u','v','w','x','y','z' };

        for(int i=0; i<word.length(); i++){
            for(int j=0; j<alphabet.length; j++){
                if (word.charAt(i)== alphabet[j]){
                    temp=alphabet[j+5];
                }

            }
            newWord+=temp;
        }


        return newWord;
    }

    }



