package C46_C60;

import java.util.Scanner;

public class C49_If_Else {
    public static void main(String[] args) {
       /* Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz..");
        int yas = scanner.nextInt();
        System.out.println("Lütfen cinsiyeti giriniz E erkek K kadin ");
        char cinsiyet = scanner.next().charAt(0);

        if ( yas >= 60 && cinsiyet == 'K'){
            System.out.println("Kadin emekli olabilirsiniz..");
        } else if (yas < 60 && cinsiyet == 'K') {
            System.out.println("Kadin emekli olamaz "+ ( 60- yas) + " yil daha calismalsiniz" );
        } else if (yas >= 65 && cinsiyet == 'E') {
            System.out.println("Erkek emekli olabilirsiniz..");
        } else if (yas < 65 && cinsiyet == 'E') {
            System.out.println("ERkek emekli olamaz "+ ( 65- yas) + " yil daha calismalsiniz" );
        }
    }
}
