package day30_inheritance;

public class BToyota extends Araba {

    String marka = "Toyota";
    String aku = "Inci aku";
    String lastik = "Bridgestone";


    public void motor() {
        System.out.println("Toyotolar cevreci toyota motorlar kullanir");
    }

    public void guvenlik(){
        System.out.println("Toyota araclar extra guvenlik onlemleri barindirir");
    }



}
