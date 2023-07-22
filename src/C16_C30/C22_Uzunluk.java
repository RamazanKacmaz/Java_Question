package C16_C30;

import java.util.Arrays;
import java.util.Scanner;

public class C22_Uzunluk {
   /* Soru 31-)
    Kullanıcıdan Arrayin uzunlugunu isteyin.
    Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir uzunluk giriniz");
        int size = scanner.nextInt();

        int[] arr= new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.println("Lptfen sirayla elamanlari girin");
            int element = scanner.nextInt();
            arr[i] += element;
        }

        System.out.println(Arrays.toString(arr));


    }
}
