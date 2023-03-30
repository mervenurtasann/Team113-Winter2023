package day02_dataTypes_Scanner;

public class C03_NonPrimitiveTypes {
    public static void main(String[] args) {

        String name = "Ali Can" ;

        String firstLetter = "K" ;
        char firstLetter2 = 'm';

        // tek bir karakter atayacaksak ikisini de kullanabiliriz

        System.out.println(firstLetter.toLowerCase()); // k
        System.out.println(firstLetter2);

        // primitive data turundeki variable'lar sadece DEGER tasiyabilir
        // non-primitive data turundeki variable'larin hem deger hem de method'lari olur

        String text= "sdgjkajegljsdggklsdffjsgkljks" +
                "dgasjkldslgjklşdfsşklsdlşkfgklşdsflkşlkgşfbdlşksklşgf " +
                "sjdkfjklgasjdlkslskjkgljdfffsflksgkljskljd" +
                "dkjlfsgjlsgdfkljsdgklgdlskjdgkljg" +
                "jagsdjlagljkafdkljdkla" ;

        String not = "not";
        String Not = "Variable isimlerinin buyuk harf ile baslamasi tavsiye edilmez ama java kabul eder" ;
        String nOT = "Bir kere deklare eden variable tekrar deklare edilemez";
        String noT = "ama isimler farkli sekilde yazildigi icin java bunlari farkli variable olarak kabul eder";

        // camelCase : kucuk harfle baslar, sonraki kelimeler bitisik yazilir ve ilk harfi buyuk olur
        // ilkHarf, ogrenciNo, okulDefteriDolabi
        // naming convention
    }
}
