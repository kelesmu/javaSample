package Constructor;

public class MainPage {

    public static void main(String[] args) {
        Student s1= new Student("Ahmet", 16,1334);
        Student s3=new Student("Mehmet",13,1443);
        Student s2= new Student();

        s3.printStudentDetails();
        s1.printStudentDetails();
        System.out.println(s1.equals(s3));


        System.out.println("----------------");

        Customer c1=new Customer();
        c1.setZip(11223);

        Customer.address="amdndkdjs";


        Customer c2= new Customer("veliddin", 13243,10023);

        c1.customerDetails();
        System.out.println("---------");
        c2.setName("Levazimat.yeni isim");
        c2.customerDetails();

   // Customer.address="nnsmsm";
        System.out.println(Customer.address);

    }

}
