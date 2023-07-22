package C01_C15;

import java.util.Scanner;

public class C02_übung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        /*System.out.println("Lütfen bir metin yaziniz ...");
        String metin = scanner.nextLine();
        String sonuc ="";
        for (int i = metin.length()-1; i >= 0 ; i--) {
            sonuc += metin.charAt(i);
        }
        System.out.println(sonuc);*/

       /* Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.*/

        /*System.out.println("Lütfen bir tamsayi girniz ::::::");
        int sayi =  scanner.nextInt();

        boolean flag = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0 ){
                System.out.println("Asal degil");
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("asal");
        }*/


        int sayi = 0;
        int toplam = 0;

        while (toplam <= 500){
            System.out.println("Lütfen bir sayi griniz");
            sayi = scanner.nextInt();
            toplam += sayi;
        }

        System.out.println("Giriln toplm : " + toplam );


    }
}
