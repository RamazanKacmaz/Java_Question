import java.util.Scanner;

public class C03_SayilarinToplami {
   /* Soru 12-)
    Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
    Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
    Ipucu:  IF/Else kullanabilirsiniz.
    Örnek:
    İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
    Konsolda Çıktı :
    Sayıların toplamı: 71  veya  Fazla Yüklenme*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz..");
        double sayi1 = scanner.nextDouble();
        System.out.println("Lütfen bir sayi giriniz..");
        double sayi2 = scanner.nextDouble();

        double toplam = sayi1 +sayi2 ;

        String sayi1uzunluk = ""+sayi1;

        System.out.println(sayi1uzunluk.length());

        int yas = 55;

        String yeni = String.valueOf(yas);
        System.out.println(yeni.length());

        System.out.println("________________________________");

        if (toplam > 1000000000){
            System.out.println("Fazla yüklenme");
        }else {
            System.out.println("Sayilarin toplami : " + toplam + " dir..");
        }


    }
}
