package C16_C30;

import java.util.Scanner;

public class Ogrenci {
   /* Soru 43-)
    Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.

    Changename adında bir method oluşturun,
    parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri
    değiştirin ve yeni bilgileri ekleyip yazdırın.

    Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.*/

    private String ad;
    private String soyad;
    private int yas;
    private String okul;

    public Ogrenci(String ad, String soyad, int yas, String okul) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.okul = okul;
    }

    public void changename(String yeniAd, String yeniSoyad, int yeniYas, String yeniOkul) {
        ad = yeniAd;
        soyad = yeniSoyad;
        yas = yeniYas;
        okul = yeniOkul;
    }

    public void changesurname(String yeniSoyad) {
        soyad = yeniSoyad;
    }

    public void printInfo() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Okul: " + okul);
        System.out.println();
    }

    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Yılmaz", 20, "Üniversite A");
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Kaya", 19, "Üniversite B");

        System.out.println("İlk Durum:");
        ogrenci1.printInfo();
        ogrenci2.printInfo();

        // İlk öğrencinin bilgilerini değiştirme
        ogrenci1.changename("Mehmet", "Can", 21, "Üniversite C");

        // İkinci öğrencinin soyadını değiştirme
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yeni soyad giriniz: ");
        String yeniSoyad = scanner.nextLine();
        ogrenci2.changesurname(yeniSoyad);


        scanner.close();

        System.out.println("Değişiklik Sonrası:");
        ogrenci1.printInfo();
        ogrenci2.printInfo();

    }


}
