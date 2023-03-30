package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz : ");

        int girilenSayi = scan.nextInt(); // 135

        int rakam = girilenSayi % 10;

        int rakamlarToplami = rakam;

        // ========

        // System.out.println(rakam); // 5

        girilenSayi = girilenSayi / 10; // sayi = 13

        rakam = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + rakam ;

        // =========

        girilenSayi = girilenSayi / 10; // 13 / 10 ===>1

        rakam = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + rakam;

        System.out.println("Girilen sayının rakamlar toplami : " + rakamlarToplami);



    }
}
