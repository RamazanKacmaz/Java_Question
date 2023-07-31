package C76_C90;

import javax.swing.*;
import java.util.Scanner;

public class C87_Do_While_loop {
    public static void main(String[] args) {

        /*Soru 2-  Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.*/

        Scanner scanner = new Scanner(System.in);

        String password;

        do {
            System.out.println("Lütfen bir sifre giriniz..");
            password =  scanner.nextLine();
        }while (!checkPassword(password));

        System.out.println("Sifre kabul edilmistir..");
    }

    private  static boolean checkPassword(String password){
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpeicial = false;

        if (password.length() < 8){
            System.out.println("Sifre 8 krakter olmali");
            return false;
        }


        for (char ch : password.toCharArray()
             ) {
            if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isLetterOrDigit(ch))
                hasSpeicial = true;

        }

        if (!hasLower)
            System.out.println("Sifre kucuk harf icermelidir.");
        if (!hasUpper)
            System.out.println("Sifre buyuk harf icermelidir.");
        if (!hasSpeicial)
            System.out.println("Sifre ozel karakter icermelidir.");

        return (hasLower && hasUpper && hasSpeicial);
    }


}
