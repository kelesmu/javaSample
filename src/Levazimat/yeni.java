package Levazimat;

import org.junit.Test;

public class yeni {


   // public static void main(String [] args) {

     @Test
     public void deneme(){
        String m = "Mustafa";

        int i;
        for (i = 6; i >= 0; i--) {
            System.out.print(m.charAt(i));
        }
    }

    public static void main(String[] args) {

        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(solution(10));
    }

    public static String toJadenCase(String phrase) {
        String newStr="";
        String[] words = phrase.split(" ");
        for(String word : words){
            newStr+= word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase()+ " ";
        }
        return newStr.substring(0,newStr.length()-1);

    }

    public static int solution(int number) {
        int sum=0;

        for (int i=0; i<number; i++){
            if(i%3==0 || i%5==0){
                sum= sum+i;
            }
        }

        return sum;
    }


}
