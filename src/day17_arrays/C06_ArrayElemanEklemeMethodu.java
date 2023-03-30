package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip,
        // yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        arr = arrayeElemanEkle(arr, 5);// [2, 4, 7, 8, 5]
        arr = arrayeElemanEkle(arr, 3); // [2, 4, 7, 8, 5, 3]
        arr = arrayeElemanEkle(arr, 19); // [2, 4, 7, 8, 5, 3, 19]
        System.out.println(Arrays.toString(arr));



        // arr'ye method'u kullanarak 5 ekleyin
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement){

        int[] yeniArray = new int[arr.length+1]; // [0,0,0,0,0}

        for (int i = 0; i < arr.length ; i++) {

            yeniArray[i] = arr[i];
        } // yeniArray [2,4,7,8,0]

        yeniArray[yeniArray.length-1] = eklenecekElement;

        return yeniArray;
    }
}
