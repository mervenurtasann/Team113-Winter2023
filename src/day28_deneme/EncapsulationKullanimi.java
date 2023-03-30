package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsulateDatalar;

public class EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C03_EncapsulateDatalar.getIsim());

        C03_EncapsulateDatalar obj = new C03_EncapsulateDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println("Toplam satis : " + obj.getToplamSatis());


    }
}
/*
    C03_EncapsuleDatalar class'indaki
    isim variable'inin degeri gorunsun ama degistirilemesin
    satisTutari ise deger girilebilsin ama girilen degerler sonradan gorulemesin

    Eger bir variable icin read veya write ozelliklerinin
    birbirinden ayrilmasi isteniyorsa
    oncelikle access modifier ile kimsenin ulasamamasini saglayin

    private yaparak kimsenin ulasamayacagini garantiye aldiktan sonra

    READ yetkisi vermek istediklerimiz icin getter()
    WRITE yetkisi vermek istediklerimiz icin setter() olusturmaliyiz

 */
