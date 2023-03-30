package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        // yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        if(yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olabilmek icin daha " + (65 - yas) + " yil calismalisin");
        }
    }
}
