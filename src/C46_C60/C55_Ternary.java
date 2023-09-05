package C46_C60;

import java.util.Scanner;

public class C55_Ternary {
    /*Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 kenar uzunlugugirniz..");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        String  result = kenar1 == kenar2 && kenar2 == kenar3 ? "Eskenar ucgen" : "Eskenar degil” yazdirin";
        System.out.println(result);
    }
}
