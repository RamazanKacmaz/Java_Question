package C01_C15;

import java.util.Scanner;

public class C02_KrediKarti {
    /*Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
    Ad ve soyadın baş harfleri büyük olmalıdır
    Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
    Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
            Ipucu: IF ile çözebilirsiniz.
            Giriş :
            > Gandalf Grey 563245879632
    Çıktı :
            > İsim : G****** G***
            > CCN : **** **** 9632*/



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen adinizi giriniz..");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyadinizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfem kredi karti numaranizi giriniz..");
        String kredikartinumarasi = scanner.nextLine();

        isim = isim.substring(0 ,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        kredikartinumarasi = kredikartinumarasi.substring(0,1)+kredikartinumarasi.substring(1).replaceAll("\\w" , "*");

        if (kredikartinumarasi.length() < 16){
            System.out.println("Gecersiz kart numarasi");
        } else {
            System.out.println("Isminiz : " + isim + "\nSoyisim :" + soyisim + "\nKartiniz : "+ kredikartinumarasi);
        }
    }

}
