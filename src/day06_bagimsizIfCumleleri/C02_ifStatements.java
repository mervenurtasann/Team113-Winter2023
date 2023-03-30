package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        /*
           Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
           “Sayi 5’in tam kati” yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();

        if (number % 5 == 0) {
            System.out.println("Sayi 5' in tam kati");
        }

        // Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        // sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        if (number % 3 == 0) {
            System.out.println("Uc ile bolunebilen sayi");
        }
    }
}
