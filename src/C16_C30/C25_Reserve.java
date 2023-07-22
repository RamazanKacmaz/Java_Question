package C16_C30;

import java.util.Arrays;

public class C25_Reserve {
    /*Soru 33-)
    Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın
    (boşluklar ve özel karakterler dahil).
    Örnek:
    String str=''Kodlama harika.''
    String arr[]: ".etaerg si gnidoC"
    İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın*/

    public static void main(String[] args) {
        String str="Kodlama harika.";

       // String [] arr = new String[str.length()];

        String [] arr1 = str.split("");

        System.out.println(Arrays.toString(arr1));

        String gecici ;

        for (int i = 0; i <arr1.length / 2 ; i++) {
            gecici = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];

        }

        System.out.println(Arrays.toString(arr1));





    }
}
