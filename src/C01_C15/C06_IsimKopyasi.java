package C01_C15;

import java.util.Scanner;
import java.util.SortedMap;

public class C06_IsimKopyasi {
  /*  Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin
    son 3 harfinin 2 kopyasından oluşan
    yeni bir String oluşturun ve konsolda yazdırın
    Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
    Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
    Loopun içerisinde StringM methodlarından  yararlanalım*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen en az 5 harfli bir kelime giriniz..");
        String kelime = scanner.nextLine();

        String yenikelime1 = kelime.substring(kelime.length()-3);
        String yenikelime2 = kelime.substring(kelime.length()-3);

        while (kelime.length() < 5){
            System.out.println("Lütfen yeni bir kelime giriniz");
            break;
        }

        System.out.println("Yazilan kelime : " + kelime + " son uc harfi : " + yenikelime1 + " " + yenikelime1);

    }
}
