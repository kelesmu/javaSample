package OOPSsamples;

public class Encapsuations {

    public static void main(String[] args) {

    //when we create an object we can reach only public and protected variables and methods of that class
    //But we can't access private and static variables and methods because private is not visible from other classes and
        // static method/variables belong to class not instance.
        Encapsulleme en = new Encapsulleme();
        System.out.println(en.year);




    }

}
