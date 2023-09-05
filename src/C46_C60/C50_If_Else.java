package C46_C60;

import java.util.Scanner;

public class C50_If_Else {
    public static void main(String[] args) {
        /*Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.*/

        Scanner scanner = new Scanner( System.in);
        System.out.println( "Lütfen bouynuzu giriniz...");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz ");
        double kilo = scanner.nextDouble();
        double kitle = ((kilo*10000) / (boy*boy));

        if (kitle > 30 ){
            System.out.println("OBEZ");
        } else if (kitle > 25 ) {
            System.out.println("KILOLU");
        } else if (kitle > 20 ) {
            System.out.println("ZAYIF");
        }else {
            System.out.println("aclik orucu");
        }
    }
}
