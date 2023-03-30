package day11_stringManipulations_ForLoop;

public class C06_replace {
    public static void main(String[] args) {

        // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.40 €”
        // output : 26.70 €

        String input1 = "15.30 €";
        String input2 = "11.40 €";

        // inpıt'larda digit olmayan her seyi yok edelim

        input1 = input1.replaceAll("\\D",""); // 1530
        input2 = input2.replaceAll("\\D", ""); // 1140

        // digit olmayanlari yok ettik ama String olduklari icin toplayamayiz
        // int'a parse etmeliyiz

        int inp1= Integer.parseInt(input1);
        int inp2 = Integer.parseInt(input2);

        System.out.println((double)(inp1 + inp2) / 100 + " €");
    }
}
