package StringAlistirmalari;

public class Reverse {


    public static void main(String[] args) {
        //Once bir tane String yaziyoruz. Altina da ters cevrilecek stringleri koymak icin bos string declare ediyoruz.
        String abc= "Sezai";
        String dummy="";

        //for loopta i indeksi tek tek tum karakterlerin uzerinde gezinir.
        //bunu sondan baslatirsak ilk son harfi alir. Bunun icin stringin boyutunu tespit etmek ici abc.lenght diyoruz
        // ama index sifirdan basladigi icin sonuna -1 koyuyoruz. cunku kelimemiz bes harfli ama 5. index bos.
        //cunku sifirinci indexten basliyor malum. sonra birer eksilterek tum harfleri sondan basa elden geciriyoruz.
        for (int i=abc.length()-1;i>=0; i--){
            //sondan aldigimiz her harfi bos stringe ekliyoruz boylece tersten yazmis oluyoruz.
            //i tum indeskleri gezmemizi sagliyo ama oradaki her karakterin degerini almak icin charAt metodunu kullaniyoruz.
            //boylece mubarek seza kelimesini tersten yazmis oluyoruz.
            //yahoonun interviewinde sormuslar
            dummy= dummy+abc.charAt(i);
        }
        System.out.println(dummy);

    }
}
