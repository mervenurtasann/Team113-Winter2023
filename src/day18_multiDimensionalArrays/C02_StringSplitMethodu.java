package day18_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // Bir string'i istedigimiz parcalara ayirmak icin kullanilir

        String str = "Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can]

        System.out.println("kelime sayisi : " + kelimeler.length); // 3

        // en uzun kelime kac harflidir?
        int enUzunKelimeLength =kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length() > enUzunKelimeLength){
                enUzunKelimeLength = kelimeler[i].length();
            }

        }

        System.out.println("En uzun kelimenin karakter sayisi : " + enUzunKelimeLength);

        // bir string'i karakterlerine ayirmak istersek

        String[] karakterler = str.split("");

        System.out.println(Arrays.toString(karakterler));
        // [J, a, v, a,  , c, a, n, d, i, r,  , c, a, n, ,,  , b, u, n, d, a, n,  , s, u, p, h, e, s, i,  , o, l, a, n,  , v, a, r,  , m, i, ?]
        System.out.println("Cumledeki karakter sayisi : " + karakterler.length);

    }
}
