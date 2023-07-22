package C16_C30;

import java.util.ArrayList;
import java.util.List;

public class C21_ArraySring {
   /* Soru 30-)
    Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
            ( mülakat sorusu )
    Örnek:
    String str="Javacokkolay"
    Yinelenen karakterler : [a, o, k]
    İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.*/

    public static void main(String[] args) {

        String metin = "Sevgi yoldasi insanlar";
        char [] krakter = metin.toCharArray();

        List<String> tekrarlist = new ArrayList<>();

        for (int i = 0; i <krakter.length ; i++) {
            for (int j = i+1 ; j < krakter.length ; j++) {
                if (krakter[i] == krakter[j] && !tekrarlist.contains(String.valueOf(krakter[i]))){
                    tekrarlist.add(String.valueOf(krakter[i]));
                }
            }
        }
        System.out.println(tekrarlist);

        // Örnek bir metin oluşturalım
        String metin1 = "Merhaba";

        // split() metodu ile stringi boşluk olmadan karakterlere bölelim
        String[] arr = metin1.split("");

        // Elde edilen parçaları ekrana yazdıralı
        for (String parca : arr) {
            System.out.print(parca + " ");
        }



    }
}
