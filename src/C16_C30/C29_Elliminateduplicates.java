package C16_C30;

import java.util.Arrays;
import java.util.Scanner;

public class C29_Elliminateduplicates {
    /*Soru 37-)
            (Tekrarlananları çıkar)
    TÜR:
    Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
    On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
            ---->>>
    public static int[] eliminateDuplicates(int[] list)
    ÖRNEK:
    On sayi giriniz:
            1 2 3 2 1 6 3 4 5 2
    ÇIKTI:
    Birbirinden farkli girilen sayilar: 1 2 3 6 4 5*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayilari giriniz...");
        int sayi = scanner.nextInt();

        int [] sayi2 = new int[sayi];

        System.out.println(Arrays.toString(sayi2));

        System.out.println("Elaman ekle");

        for (int i = 0; i < sayi ; i++) {
            sayi2 [i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(sayi2));





    }


}
