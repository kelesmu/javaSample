package OOPSsamples;

public class Encapsulleme {

    //when we create an object we can reach only public and protected variables and methods of that class
    //But we can't access private and static variables and methods because private is not visible from other classes and
    // static method/variables belong to class not instance.
    private int age;
    private String name;
    private String surName;
    int year=2020;
    protected String name1 =null;
    static String country = "Turkiye";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.startsWith("M")){


        this.name = name;
    }}

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0 && age<100) {
            this.age = age;
        }
    else {
            System.out.println("age can not less than 0 and more than a hundred");
        }
    }
    public void ornek(){
        System.out.println(age);
        System.out.println();
    }

    public static void main(String[] args) {
        Encapsulleme ens=new Encapsulleme();


        ens.setAge(102);
        ens.setName("Mustafa");
        System.out.println(ens.getName());
        System.out.println(ens.getAge());
        ens.ornek();


    }
}
