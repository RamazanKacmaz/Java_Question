package C01_C15;

import java.util.Scanner;

public class C08_isimAynikrakter {
    /*Soru 17-)
    Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
    Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
    İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
    değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
            Ipucu:
    IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir isim giriniz...");
        String isim = scanner.nextLine();



        char ilk = isim.charAt(0);
        char iki = isim.charAt(1);
        char uc = isim.charAt(2);

        if (isim.length() != 3){
            System.out.println("En az uc krakter girmelisiniz...");
        } else{
            System.out.println(ilk == iki || ilk == uc || iki == uc ? "dizi yenilenen krKTERE SAHIP" : " Dizi benzersiz krakterlere sahip"  );

        }


    }
}
