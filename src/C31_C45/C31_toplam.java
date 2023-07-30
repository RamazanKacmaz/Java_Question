package C31_C45;

import java.util.Arrays;

public class C31_toplam {
   /* Soru-39)
    Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren
     bir method yazın ve ardından sonucu main methodda yazdırın.
    Örn:
    girdi : {1,2,3,4,5,6,7,8}
    çıkış: 36
    ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün*/

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        toplam(arr);

        System.out.println(Arrays.toString(toplam(arr)));

    }

    public static int[] toplam(int[] arr) {



        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        return new int[]{toplam};
    }


}
