package day03_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius: ");

        // kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun
        // kullanicidan bilgiyi almak icin scan objesini ve ilgili next method'unu kullanin

        double radius = scan.nextDouble();

        // cevresini ve alanini yazdirin.

        System.out.println("Circumference of the circle : " + 2 * 3.14 * radius);

        System.out.println("Area of the circle : " + 3.14 * radius * radius);
    }
}
