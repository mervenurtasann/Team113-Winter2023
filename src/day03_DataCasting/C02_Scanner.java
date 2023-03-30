package day03_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

         // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
         // girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);

        // isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("Please, enter your name, surname and age: " +
                "\nPress enter after each information");

        char nameFirstLetter = scan.nextLine().charAt(0);

        /*
            Scanner method'larinda nextChar() uok
            bunun icin once kullanicinin girisine gore next() veya nextLine() yazip
            sonra .charAt(0) yazariz
            parantez icindeki 0 almak istedigimiz char'in index'idir
            ve java'da index 0'dan baslar

         */

        String surname = scan.nextLine();
        double age = scan.nextDouble();

        // girilen bilgiler : J Doe, 44
        System.out.println("Enter informations : " + nameFirstLetter + " " + surname + ", " + age);
    }
}
