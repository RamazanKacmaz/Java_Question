package C46_C60;

import java.util.Scanner;

public class C56_Ternary {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf girniz..");
        char harf = scanner.next().charAt(0);

        char yeni = ((harf >= 'a') && (harf <= 'z')) ? Character.toUpperCase(harf) : 'n';
        System.out.println(yeni);
    }
}
