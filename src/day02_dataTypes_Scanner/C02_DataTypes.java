package day02_dataTypes_Scanner;

public class C02_DataTypes {
    public static void main(String[] args) {

        char firstLetter = '8' ; // Tek tirnak icinde tek karakter (harf,sayi,ozel karakter..)

        byte studentAge1= 15; // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir
        short studentAge2 = 16;
        int studentAge3 = 14;
        long studentAge4 = 15;

        double number1 = 3.1234567890123456789;
        System.out.println(number1);

        // Double virgülden sonra 16 hane yazdirir, ama cok kucuk sayilara indigi icin
        // ondalikli kismin sonunda hatalar olabilir
        // 15 / 3 = 4.999999999999 5.0 5.000000001

        float number2 = 45.5433345784545f;
        // float sayi tanimladigimizda double'dan farkli oldugunu belirtmek icin
        // sonuna f veya F yazmak zorundayiz
        System.out.println(number2);

        // Biz dersler boyunca hafiza onemli olmadigi icin
        // tam sayilar icin int, ondalikli sayilar icin de double kullaniriz
    }
}
