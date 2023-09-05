package C46_C60;

import java.util.Scanner;

public class C47_If_Else {
    /*Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
    olup olmadigini yazdirin.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz...");
        char harf = scanner.next().charAt(0);

        if (harf >= 'A' && harf <= 'Z'){
            System.out.println("buyuk harf");
        }else {
            System.out.println("Kucuk harf");
        }
    }
}
