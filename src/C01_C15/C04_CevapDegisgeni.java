package C01_C15;

import java.util.Scanner;

public class C04_CevapDegisgeni {
    /*Soru 13-)
    Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
    Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
    Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
    Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
    Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
    Ipucu:
    Switch konusunu hatırlayalım!*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scanner.next().charAt(0);

        switch (harf){
            case 'a':
                System.out.println("İsteğiniz işleniyor...Lütfen bekleyiniz...");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz...");
                break;
            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz...");
                break;
            default:
                System.out.println("'Geçersiz giriş, lütfen tekrar deneyin!");
        }

    }
}
