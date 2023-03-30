package day18_multiDimensionalArrays;

import java.util.Arrays;

public class aaaa {
    public static void main(String[] args) {
        int [][] arr={{3,4,5},{2,3,6,7}};

        int index = arr[0].length<arr[1].length ? arr[0].length : arr[1].length;

        int [] yeniArr=new int[index];

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]=arr[0][i]+ arr[1][i];

        }


        System.out.println(Arrays.toString(yeniArr));
    }
}
