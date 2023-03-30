package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir değer degildir
        // null bir pointer'dir,
        // yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder

        String str; // str olusturuldu ama deger atanmadi

        // java method icerisinde deger atamadan variable olusturulmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez

        // System.out.println(str); CTE
        // str.concat("Java"); CTE

        // Bazen programlarda variable'lar olusturulur ama
        // daha sonra deger atanacagi icin deger atamasi yapilmaz
        // deger atamasi yapilmadan liseteleme bile CTE verdigi icin
        // deger verilmedigini isretleyecek, ama CTE olusmasini engelleyecek
        // bir cozum olarak null pointer olusturulmustur

        str = null; // str = "null" degil
                    // null olarak isaretlenmis, degeri null atanmis degil
        System.out.println(str); // null
        // System.out.println(str.concat("Java")); // Run Time Error----NullPointerException
        // System.out.println(str.length()); // NullPointerException

        System.out.println(str + "Java"); // nullJava
        String str2 =  str + "Java";
        System.out.println("str2 : " + str2); // nullJava

        // int sayi = null;  primitive variable'lara null degeri olmaz
        Integer sayi = null;

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak
        // hiclik degeri atariz

        String str3 = ""; // str3'e deger atanmistir
                          // atanan deger hiclik'tir

        System.out.println(str3.concat("Java")); // Java

        // System.out.println(str.isEmpty()); // NullPointerException
        // null olarak isaretlenen bir string HIC BIR METHOD'la kullanilamaz
        // sadece yazdirilabilir veya + ile kullanilabilir

        System.out.println(str3.isEmpty()); // true
    }
}
