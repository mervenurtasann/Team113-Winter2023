package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElementleriBulma {
    public static void main(String[] args) {
        // Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //         ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {2, 3, 6, 7, 4, 7};
        int[] arr2 = {1, 3, 5, 7, 9, 3};

        List<Integer> ortaklar = new ArrayList<>();

        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1 == each2 && !ortaklar.contains(each1)) {
                    ortaklar.add(each1);
                    break;
                }
            }
        }

        System.out.println("Ortak elemanlar : " + ortaklar);

    }
}
