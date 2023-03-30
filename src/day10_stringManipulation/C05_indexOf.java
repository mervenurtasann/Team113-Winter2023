package day10_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java cok ama cok guzel";

        System.out.println(str.indexOf("c")); // 5

        System.out.println(str.indexOf("a")); // birden fazla ise ilk buldugunu verir : 1

        System.out.println(str.indexOf("cok")); // 5

        System.out.println(str.indexOf("cok", 6)); // 13
        System.out.println(str.indexOf("cok", 5)); // 5

        System.out.println(str.indexOf("java")); // -1  aranan String yoksa -1 doner


        // verilen bir cumlede, istenen bir string icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle = "Yasasin java, iyi ki java ogreniyorum java";
        String kelime = "java";

        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else { // kesinlikle kelime cumlede var, ama kac tane ?
            int kelimeIlkIndex = cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime, (kelimeIlkIndex + 1)) == (-1)){
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            } else {
                int ikinciKelimeIndex = cumle.indexOf(kelime, (kelimeIlkIndex + 1));
                if (cumle.indexOf(kelime, (ikinciKelimeIndex + 1)) == (-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else {
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }
        }
    }
}
