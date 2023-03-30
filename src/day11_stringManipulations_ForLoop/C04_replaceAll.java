package day11_stringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str = "J1a23va34 5C54an6d5ir87";

        // str'daki sayilari metodla temizleyin

        /*
        Eger degistirmek istedigimiz metin tek bir metin degil,
        ortak ozelligi olan farkli metinlerse

        - tum sayilar
        - sayi olmayanlarin tumu
        - tum space'ler
        - space olmayan tum karakterler

        bu ortak ozellikleri belirtmek icin Java regex tanimlanmistir

         */

        str = str.replaceAll("\\d", "");
        System.out.println("str : " + str);
    }
}
