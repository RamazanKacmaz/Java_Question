package C16_C30;

import java.util.Scanner;

public class C19_TersSayi {
    /*Soru-28)
    Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
    Örnek:
    Sayı: 1238
    Sayının Tersi: 8321
    İpucu:  Loop kullanabilirsiniz.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz...");
        int sayi = scanner.nextInt();
        String tersayi = String.valueOf(sayi);


        for (int i = tersayi.length()-1; i >=  0 ; i--) {
            System.out.print(tersayi.charAt(i));
        }
    }

}
