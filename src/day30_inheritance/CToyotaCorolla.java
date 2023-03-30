package day30_inheritance;

public class CToyotaCorolla extends BToyota {

    String lastik = "Lassa 205-55-15";
    String model = "Corolla";
    String yakit = "Corolla dizel,benzinli ve elektrikli olabilir";


    public void motor() { System.out.println("Corolla araclar turkiye'de uretilen motor kullanir");}

    public void uretimYeri() { System.out.println("Corolla araclar Turkiye'de uretilir");}

    public static void main(String[] args) {

        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik); // Lassa 205-55-15
        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.yakit); // Corolla dizel,benzinli ve elektrikli olabilir
        corolla.motor(); // Corolla araclar turkiye'de uretilen motor kullanir
        corolla.uretimYeri(); // Corolla araclar Turkiye'de uretilir

        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.aku); // Inci aku
        corolla.guvenlik(); // Toyota araclar extra guvenlik onlemleri barindirir

        System.out.println(corolla.vites); // Tum arabalarin vitesi olur

    }
}
