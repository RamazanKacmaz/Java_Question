package C31_C45;

import java.util.Scanner;

public class C44_Is_Else {
    public static void main(String[] args) {

       /* Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir uc kenar uzunlugu giriniz...");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int keanr3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == keanr3){
            System.out.println("Eskenar ucgen ....");
        }else {
            System.out.println("Eskenar degil....");
        }
    }
}
