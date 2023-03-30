package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
            While Loop'da bitis sarti kontorlu her zaman body'den bir fazla calisir
            while loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
            bu da bazen hatalara sebep olur
         */

        int sayi = 3;
        int toplam = 0;

        while (sayi > 0){

            toplam += sayi * sayi;
            sayi--;
        }

        System.out.println("while toplam : " + toplam);

        sayi = 3;
        toplam = 0;

        do{
            toplam += sayi * sayi;
            sayi--;
        }while (sayi>0);

        System.out.println("do while toplam : " + toplam);
    }
}
