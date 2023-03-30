package day03_DataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {

        /*
          Bazi primitive data turleri baska hic bir data turunden deger kabul etmez
          Bazı primitive data turlere ozel sartlar ile baska turdeki datalari deger olarak kabul eder
         */
        boolean bl = false ;

        bl =true;

        // bl = "true";
        // bl = 20 ;
        // bl = 'a';

        char ch = 't' ;
        ch = '%';
        ch = ' ' ;
        ch = 99;

        int number1 = 20;

        short number2 = 15;

        double number3 = 24;

        number1 = number2; // int <=== short
        // number1 = number3; int <=== double

        // number2 = number1; short <=== int
        // number2 = number3; short <=== double

        number3 = number1; // double <=== int
        number3 = number2; // double <=== short

        number1 = ch;
        // number3 = ch;
        number3 = ch;
    }
}
