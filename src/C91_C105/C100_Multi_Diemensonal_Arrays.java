package C91_C105;

import java.util.Arrays;

public class C100_Multi_Diemensonal_Arrays {
    /*Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
    toplaminini yazdiran bir method olusturun.*/

    public static void main(String[] args) {

        int[][] arr = {{3,4,5}, {2,3,6,7}};
        System.out.println("Input : " + Arrays.deepToString(arr));

        sonelamanlarintoplami(arr);

    }

    private static void sonelamanlarintoplami(int[][] arr) {
        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {

            toplam += arr[i][arr[i].length-1];
        }

        System.out.println("Son elemanetlerin toplami : " + toplam);



    }
}
