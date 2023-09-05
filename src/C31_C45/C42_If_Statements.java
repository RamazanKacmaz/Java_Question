package C31_C45;

import java.util.Scanner;

public class C42_If_Statements {
    public static void main(String[] args) {
       /* Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen uc adet sayi giriniz..");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int keanr3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == keanr3){
            System.out.println("Eskenar ucgen ....");
        }
    }
}
