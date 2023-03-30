package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter : ");

        char letter = scan.next().charAt(0);

        System.out.println("Enter letter : " + letter +
                            "\n3 letters after the entered letter : " +
                             (char)(letter + 1) + ", " +
                             (char)(letter + 2) + ", " +
                             (char)(letter + 3) );
    }
}
