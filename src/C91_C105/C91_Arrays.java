package C91_C105;

import java.util.Arrays;

public class C91_Arrays {
    public static void main(String[] args) {
        /*Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.*/

        int [] arr = {3,5,8,7,9,15,6,1,};
        int arananelaman = 3;

        aranan(arr,arananelaman);

    }

    private static void aranan(int[] arr, int arananelaman) {

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == arananelaman){
                sayac++;
            }

        }
        System.out.println("Aranan elaman : " + arananelaman + " kere" + sayac+ " kullanilmis");
    }
}
