package C31_C45;

import java.util.Scanner;

public class C39_If_Statemenets {
    public static void main(String[] args) {

        /*Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz : ");
        int tamSayi = scanner.nextInt();

        if (tamSayi % 5 == 0){
            System.out.println("Sayi 5’in tam kati");
        }

    }
}
