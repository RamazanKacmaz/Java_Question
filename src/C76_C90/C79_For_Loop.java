package C76_C90;

import java.util.Scanner;

public class C79_For_Loop {
    /*Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen   cumle giriniz...");
        String metin = scanner.nextLine();


        for (int i = metin.length()-1; i >= 0 ; i--) {
            System.out.print(metin.charAt(i));
        }
        System.out.println("\n=============");
        String tersmetin = "";

        for (int i = metin.length()-1; i >= 0 ; i--) {
            tersmetin += metin.charAt(i);
        }

        System.out.println(tersmetin);




    }
}
