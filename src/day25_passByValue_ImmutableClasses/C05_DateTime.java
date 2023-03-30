package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now(); // 23:10:32.674
        System.out.println(saat);

        System.out.println(saat.getNano()); // 674000000

        // bir loop ile 1'den 10bin'e kadar olan sayilari toplayin
        // ve bu islemin kac nanosasniye surdugunu bulun

        int toplam = 0;

        int basSuresiNano = saat.getNano();

        for (int i = 0; i <= 10000; i++) {
            toplam += i;
        }

        LocalTime saatSon = LocalTime.now();
        int bitSuresiNano = saatSon.getNano();

        System.out.println("Islem suresi : " + (bitSuresiNano - basSuresiNano));

    }
}
