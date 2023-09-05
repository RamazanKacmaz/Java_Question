package C46_C60;

import java.util.Scanner;

public class C59_Ternary {
    public static void main(String[] args) {

      //  Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayi girniz..");
        int not = scanner.nextInt();

        int sonuc = not >= 0 ?  not : -not ;
        System.out.println(sonuc);

    }
}
