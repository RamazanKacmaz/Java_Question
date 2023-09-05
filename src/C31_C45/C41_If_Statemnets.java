package C31_C45;

import java.util.Scanner;

public class C41_If_Statemnets {
    public static void main(String[] args) {

        /*Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0) {
            System.out.println("3 ile bolunebilir sayi");
        }
        if (sayi % 5 == 0){
            System.out.println("5 ile bolunebilir sayi");
        }
    }
}
