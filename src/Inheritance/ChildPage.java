package Inheritance;

public class ChildPage extends ParentPage{


    int age;
    String name="Ahmet";


    public void childMethod1(){

        System.out.println("This is child method1");
        System.out.println("This is child method1");

    }

    public void childMethod2(){

        System.out.println("This is child method2");
        super.parentName="asli";  //super keyword ile sadece instance variable ve metodlar cagrilabiliyor.
        ParentPage.a12=23;       //static members can be called by class name not super keyword

    }

    @Override
    public void parentMethod1() {
        super.parentMethod1();
        System.out.println("This is overriden parent Method1");
    }

    @Override
    public void parentMethod2() {
        System.out.println("This is overridden parent method2");
    }

    public static void main(String[] args) {
        ParentPage p1=new ChildPage();
        p1.parentMethod1();
        ParentPage.parentMethod3();

        System.out.println("----");
        p1.parentMethod2();
        System.out.println("-----");
        ChildPage c1 = new ChildPage();
        c1.parentMethod1();

    }

        public static boolean isSquare(int n) {

            for(int i=0; i<n/2; i++){
                if(i*i==n){
                    // fix me!
                }}
            return true;
        }
    }

