package day42_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {

    // verilen bir array'in tekrar eden elementlerini silip
    // her elementins sadece 1 kere kullanildigi hale getirin
    public static void main(String[] args) {

        int[] arr = {6, 4, 3, 2, 3, 5, 6, 4, 3, 2, 4, 6, 3, 2, 4, 5, 5, 1};

        Set<Integer> geciciSet = new HashSet<>();

        for (Integer eeach : arr) {
            geciciSet.add(eeach);
        }

        arr = new int[geciciSet.size()]; // eski array'e yeni boyut tanimladik ( 6 uzunlugunda ve bos )

        // Set'deki benzersiz hale getirilen elementleri geciciArr'ye tasiyalim

        int index = 0;
        for (Integer each : geciciSet) {
            arr[index] = each;
            index++;
        }

        // tekrarsiz degerleri gecici arr'e tasidik
        // simdi kendi array'imize bu gecici arr degerini atayalim

        System.out.println(Arrays.toString(arr));


    }
}
