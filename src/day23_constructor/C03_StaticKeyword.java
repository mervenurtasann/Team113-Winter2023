package day23_constructor;

public class C03_StaticKeyword {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "3122343434";
    static String bashekimIsmi = "Kemal Aydin";

    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1 = new C03_StaticKeyword();

        System.out.println(personel1.personelIsmi); // null
        System.out.println(hastaneIsmi); // Yildiz Hastanesi
        System.out.println(personel1.bashekimIsmi); // Kemal Aydin

        C03_StaticKeyword personel2 = new C03_StaticKeyword();

        personel2.personelIsmi = "Dogan";

        System.out.println(personel2.personelIsmi); // Dogan
        System.out.println(personel1.personelIsmi); // null

        personel2.bashekimIsmi = "Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi); // Sumeyra Gunel



        /*
            1- static variable'lar tum class icin gecerlidir (class variable)
            2- static variable'lar tum objeler icin ayni degeri tasidiklari icin
               her obje icin ayrica olusturulmaz, sadece bir variable olur
            3- static variable'lara ulasmak veya update etmek icin obje ismi kullanmaya
               gerek yoktur direk ulasilabilir.
               Baska class'dan static variable'a ulasmak icin classismi.staticVariablaIsmi
               yazilir
         */
    }
}
