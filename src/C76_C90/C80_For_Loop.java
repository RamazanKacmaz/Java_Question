package C76_C90;

import java.util.Scanner;

public class C80_For_Loop {
    public static void main(String[] args) {

        /*Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen   pozitif bir  tamsayi  giriniz...");
        int sayi = scanner.nextInt();

        boolean flag = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                System.out.println("asal degil");
                flag = false;
                break;
            }


        }
        if (flag){
            System.out.println("asall");
        }

    }
}
