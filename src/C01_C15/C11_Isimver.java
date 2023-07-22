package C01_C15;

import java.util.Scanner;

public class C11_Isimver {
   /* Soru 20-)
    Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
     Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
    Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
     aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
    yazdırın.
    İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

            Örnek:
    giriş: ama
    çıkış: Dizede yinelenen karakterler var

    İpucu: İf Else ve Char kullanarak çözebiliriz.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir isim yaziniz..");
        String isim = scanner.nextLine();
        int uzunluk = isim.length();

        char ilkkrakter = isim.charAt(0);
        char ikinvikrakter = isim.charAt(1);
        char ucuncukrakter = isim.charAt(2);

       if (uzunluk == 3){
           if (ilkkrakter == ikinvikrakter || ilkkrakter == ucuncukrakter){
               System.out.println("Dizede yinelenen karakterler var");
           }else {
               System.out.println("String benzersiz karakterlere sahip");
           }
       } else {
           System.out.println( "Bu kadar uzun cümleyi anlayamam ben agam");
       }

    }
}
