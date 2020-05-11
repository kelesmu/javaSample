package Constructor;

import java.util.Arrays;
import java.util.Collections;

public class Customer {

     String name;
    private int customerId;
    private int zip;
    static String address;

    public String getName() {
        return name;
    }

    int[] sample;



    public void setName(String name) {
        this.name = name;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Customer(){}

    public Customer(String name, int customerId, int zip) {
        this.name= name;
        this.customerId=customerId;
        this.zip=zip;


    }


    public void customerDetails(){

        System.out.println(name);
        System.out.println(zip);
        System.out.println(customerId);

    }
    public void details(){

        System.out.println(name);
    }

    public static void staticMethod(){
        System.out.println("This is static method");
    }

}
