package day03_DataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

         // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
         // Isminiz : John
         // Soyisminiz : Doe
         // Yasiniz : 44
         // Kaydiniz basariyla tamamlanmistir.


        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your name: ");

        String name = scan.nextLine();

        System.out.println("Please, enter your surname: ");

        String surname = scan.nextLine();

        System.out.println("Please, enter your age: ");

        double age = scan.nextDouble();

        /*
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Age : " + age);
        System.out.println("Your registration is complete.");
        */

        // Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // ilerde kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        // SIMDILIK kullanici biz ne diyorsak onu tam yapiyor kabul edelim

        /*
        System.out.print("Name : " + name);
        System.out.print("Surname : " + surname);
        System.out.print("Age : " + age);
        System.out.print("Your registration is complete.");

        System.out.println'deki ln
        yazdirma islemini yaptiktan sonra
        alt satira gecmesini saglar
        println yerine print yazarsak
        yazdırdigimiz seyler yanyana yazdirilir
         */

        System.out.println("\nName: " + name +
                " \nSurname: " + surname +
                " \nAge: " + age +
                " \nYour registration is complete.");

        /*
           Tek bir System.out.println() ile birden fazla satir yazdirmak isterseniz
           String bir ifadenin icinde istedigimiz yere /n yazabilirsiniz
         */
    }
}
