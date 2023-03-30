package day02_dataTypes_Scanner;

import java.util.Scanner;

public class C05_ScannerFirstAssignment {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        // ve sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin: ");

        double girilenSayi = scan.nextDouble();

        System.out.println("Girilen sayinin karesi: " + girilenSayi * girilenSayi);
    }
}
