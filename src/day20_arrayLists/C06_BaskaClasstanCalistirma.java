package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalistirma {
    public static void main(String[] args) {

        // C05'deki istanmeyenleri sil methodunu buradan kullanalim

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokeprens");
        urunler.add("Cokomel");

        String istenmeyenHarf = "o";

        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler, istenmeyenHarf));

        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcerenleriSil(urunler, "a"));
    }
}
