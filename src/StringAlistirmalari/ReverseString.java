package StringAlistirmalari;

public class ReverseString {

    public static void main(String[] args) {
        String name= "Ahmet";
        String reversed="";
        for(int i=name.length()-1; i>=0; i--){
         reversed= reversed+ name.charAt(i);
        }
        System.out.println(reversed);

        System.out.println(isPrime(21));
        numbers();
    }

    //*1- Create a method to verify if the input-int-number is prime or not. 133 -121

    public static boolean isPrime(int num){
        boolean res= true;
        for(int i=2; i < num/2; i++){
            if (num%i==0){
              res=  false;
                break;
            }
        }

        return res;
    }

  //   2- Take 20 integer inputs from user and print the following: number of positive numbers number of
    //negative numbers number of odd numbers number of even numbers number of 0s.

    public static void numbers(){

        int [] myArr= {-11,-12,-23, 3,5,6,8,9,12,23,34,45,56,67,78,65,20,103,33,43};
        int positive=0;
        int negative=0;
        int oddNum=0;
        int evenNum=0;
        int tens=0;

        for(int i: myArr){
            if (i>0){
                positive++;
            }
            if(i<0){
                negative++;
            }
            if(i%2==0){
                evenNum++;}
           else{oddNum++;}
           if(i%10==0){
               tens++;
           }

        }
        System.out.println("positive: "+ positive+" Negative:  "+ negative+" Even "+ evenNum+" Odd "+ oddNum+" Tens " +tens);

    }

}
