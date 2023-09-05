package C31_C45;

import java.util.Scanner;

public class C35_Data_Casting {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scanner.next().charAt(0);

        System.out.println((char) (harf + 1) +  " , " + (char) (harf+2) + " , " + (char) (harf+3));

    }
}
