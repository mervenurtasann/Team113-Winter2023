package day03_DataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        // Kullanici sayi1=10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1: ");

        int number1 = scan.nextInt();

        System.out.println("Enter number2: ");

        int number2 = scan.nextInt();

        int temp = 0;
        temp = number2;
        number2 = number1;
        number1 = temp;

        System.out.println("New value of number1 : " + number1);
        System.out.println("New value of number2 : " + number2);

    }
}
