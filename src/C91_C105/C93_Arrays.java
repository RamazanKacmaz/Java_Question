package C91_C105;

import java.util.Arrays;
import java.util.Scanner;

public class C93_Arrays {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        donduren bir method olusturun.*/


        System.out.println(Arrays.toString(arr()));

    }

    private static int [] arr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Arrays uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();
        int [] yeni = new int[uzunluk];

        for (int i = 0; i <yeni.length ; i++) {
            Scanner scann = new Scanner(System.in);
            System.out.println("Element giriniz");
            yeni[i] = scann.nextInt();
        }

       return yeni;

    }
}
