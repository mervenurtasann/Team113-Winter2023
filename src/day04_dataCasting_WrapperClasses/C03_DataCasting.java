package day04_dataCasting_WrapperClasses;

public class C03_DataCasting {
    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println(a/b); // 3

        // java bolunen iki sayi tamsayi ise sonucun da tamsayi kismini verir

        double c = 6;
        System.out.println(a/c); // 20  / 6 = 3.33333333
        // int / double ===> double

        // bolunen sayilarin data turleri farkli ise sonucu daha genis olanin cinsinden verir

        float d = 6f;

        System.out.println(a / d); // 20 / 6 = 3.3333333

        // a / b isleminin sonucunu ondalikli nasil yazabiliriz?

        System.out.println((double)(a/b));

        // islem onceligi (a/b)'dedir.
        // java oncelikli /a/b) islemini yapar ve sonucu 3 bulur
        // sonra (double) oldugundan 3'u double'a cast eder 3.0 bulur

        // bolme isleminin sonucunun double olmasi icim
        // isleme girenlerden birisi double olmalidir

        System.out.println((double)a /b); // 3.3333333335

        System.out.println(a/(double)b); // 3.33333333335

        int e = 1467;

        System.out.println(e = e / 10); // 146

        System.out.println(e); // 146

        e = e / 10;

        System.out.println(e); // 14

        e = e / 10;

        System.out.println(e); // 1

        e = e / 10;

        System.out.println(e); // 0
    }
}
