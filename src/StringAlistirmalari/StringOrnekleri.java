package StringAlistirmalari;


public class StringOrnekleri {

   static String ab = "  mehmet tahir  ";
   static String xyz= "Ahmetle Mehmet pazara gitti ve geldi";


    public static void main(String[] args) {
        String abc= ab.trim().replace("mehmet","ahmet");
        System.out.println(ab);
        System.out.println(abc);
        String yeniABC = abc.replaceFirst("a","A");
        System.out.println(yeniABC);
        System.out.println(ab.startsWith("mehm"));
        System.out.println(ab.trim());
       // System.out.println(trimmedAB);
       String arr[] =(xyz.split(" "));
       //for (String str: arr){
         //  System.out.println(str); }
        System.out.println(arr.length);





    }




}
