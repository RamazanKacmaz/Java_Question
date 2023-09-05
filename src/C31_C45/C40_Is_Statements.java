package C31_C45;

import java.util.Scanner;

public class C40_Is_Statements {
    public static void main(String[] args) {

        /*Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ay harfi yazin....");
       String ay = scanner.nextLine();

       if (ay.equalsIgnoreCase("o")){
           System.out.println("Ocak");
       } else if (ay.equalsIgnoreCase("s")) {
           System.out.println("Subat");

       } else if (ay.equalsIgnoreCase("m")) {
           System.out.println("Mart");
       }


    }
}
