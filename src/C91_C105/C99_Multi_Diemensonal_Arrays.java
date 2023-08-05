package C91_C105;

import java.util.Arrays;

public class C99_Multi_Diemensonal_Arrays {
    public static void main(String[] args) {

       /* Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        method olusturun.*/

        int[][] arr = {{3,4,5}, {2,3,6,7}};
        System.out.println("Input " +  Arrays.toString(arr));

        int[] output = sumInnerArrays(arr);
        System.out.println("Output: " + Arrays.toString(output));

    }

    private static int[] sumInnerArrays(int[][] arr) {
        int [] sum = new  int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            sum [i] =1;
            for (int j = 0; j <arr[i].length ; j++) {
                sum [i] *= arr[i][j];
            }
        }
        return sum;
    }
}
