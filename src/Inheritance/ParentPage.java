package Inheritance;


public class ParentPage {
    //variables

    static final String abc="nmnm";

    static String parentName="Mehmet";
    static int a12=22;
    int parentAge;
    public void parentMethod1(){
        System.out.println("This is parent method1");

    }
    public void parentMethod2(){
        System.out.println("This is parent method2");


    }

    public static void parentStaticMethod3(){

        System.out.println("This is parent static method");
    }

    public static void main(String[] args) {
    }

    public int[] frontPiece(int[] nums) {

        int index=0;


        if(nums.length>=2){
            index=2;
        }
        if(nums.length==1){
            index=1;
        }
        if(nums.length==0){
            index=0;
        }
        int [] newArr = new int[index];

        if (index==2){
            newArr [0] = nums[0];
            newArr [1] = nums[1];
        }
        if (index==1){
            newArr [0] = nums[0];
        }

        return newArr;
    }



}
