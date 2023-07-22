package C01_C15;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C09_Method {
    /*Soru 18-) Method Sorusu
    Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan
     bir method yazalım. Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim
      ve bize varış süremizi hesaplasın
    İpucu:
    yol=Hız*zaman*/

    public static void main(String[] args) {

        aracinvarissuresi();

    }

    private static void aracinvarissuresi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen hizinizi giriniz..");
        double hiz = scanner.nextDouble();
        System.out.println("Lütfen km giriniz");
        double km = scanner.nextDouble();

        double sure = km / hiz ;

        System.out.println("Varis suresi : " + sure);

    }
}
