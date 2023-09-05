package C46_C60;

import java.util.Scanner;

public class C54_Terbary_Operator {
    public static void main(String[] args) {

        /*Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi girniz..");
        int syi = scanner.nextInt();

        String result = syi % 5 == 0 ? "Sayi 5 kati" : " degil ";

        System.out.println(result);


    }
}
