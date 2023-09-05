package C61_C75;

import java.util.Scanner;
import java.util.SortedMap;

public class C72_For_Loop {
    /*Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  pozitif bir tamsayi  giriniz...");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi  ; i++) {
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }

        }

}
