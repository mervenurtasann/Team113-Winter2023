package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsulateDatalar;

public class AccessModifierKullanimi {

    public static void main(String[] args) {

        C03_EncapsulateDatalar obj = new C03_EncapsulateDatalar();
        System.out.println(obj.a); // read yetkisi
        obj.a = 100; // write

        // System.out.println(obj.satisTutari); // read yetkisi
        // obj.satisTutari = 100; // write

        /*
            Baska bir classdaki variable veya method'a ulasmak istedigimizde

            - ulasmak istedigimiz class uyesinin static olup olmamasi
              erisim yontemini etkiler
              static ise classIsmi.uyeIsmi yazarken
              static degilse obje olusturup objeIsmi.uyeIsmi

             - ulasmak istedigimiz uyenin access modifier'i ise
               o uyeye ulasip ulasamayacagimizi belirler

               ulasabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz

         */


    }
}
