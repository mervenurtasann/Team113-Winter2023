package day18_multiDimensionalArrays;

public class aa {
    public static void main(String[] args) {
        int[][] arr2 = { {3,4,5}, {2,3,6,7} } ;
        int[] arr1 = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
            arr1[i] = sum;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
