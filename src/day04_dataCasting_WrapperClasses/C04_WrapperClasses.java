package day04_dataCasting_WrapperClasses;

public class C04_WrapperClasses {
    public static void main(String[] args) {
        /*
        // non-primitive data turlerinin hazir method'lari varken
        // primitive data turlerinin hazir method'lari yoktur
        // Java primitive data turleri icin, kolayca gecis yapabilecekleri
        // non-primitive data turleri olusturmustur

        int ==> Integer
        char ==> Character
        byte ==> Byte
        boolean ==> Boolean
        */

        Integer number = 10;
        // int variable'a atadigimiz degerleri atayabiliyoruz
        // arti olarak hazir method'lari var

        // variable olusturmadan da bazi method'lari kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String sonucStr = "345";

        System.out.println(sonucStr + 10); // 34510

        // bu degere 10 ekleyin

        // int sonuc = (int)sonucStr;
        // bu durumda Wrapper class'lar imdada yetisir

        int sonuc = Integer.parseInt(sonucStr);
        System.out.println(sonuc + 10); // 355

        sonuc = Integer.valueOf(sonucStr);
        System.out.println(sonuc + 10); // 355

        char krk = '3';

        System.out.println(Character.isDigit(krk)); // true
        System.out.println(Character.isLetter(krk)); // false


    }
}
