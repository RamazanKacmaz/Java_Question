package C76_C90;

import java.util.Arrays;

import static C31_C45.C31_toplam.toplam;

public class C89_Arrays {
    public static void main(String[] args) {

        /*Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        olusturun. Eski array’i yeni haliyle kaydedin.*/

        int [] arr = {2,4,5,8,7};

        int [] modifiarr = eklenenarr1 (arr);

        System.out.println(Arrays.toString(modifiarr));

        carpim(5,3);
        System.out.println(toplam2(5, 3));


    }

    private static int toplam2(int say1 , int sayi2) {
        int toplam = say1+sayi2;
        System.out.println(toplam);
        return toplam;
    }

    private static void carpim(int sayi1 , int sayi2) {
        int carpin = sayi1*sayi2;
        System.out.println(carpin);
    }

    private static int[] eklenenarr1(int[] arr) {
        int [] eklenenarr = new  int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            eklenenarr[i] = arr[i] + 2 ;
        }
        return eklenenarr;
    }
}
