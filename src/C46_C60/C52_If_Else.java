package C46_C60;

import java.util.Scanner;

public class C52_If_Else {
    public static void main(String[] args) {
       /* Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        istediginiz birim sisteme kayitli degil” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi giriniz...");
        int mesafe = scanner.nextInt();
        System.out.println("Lütfen mesafenin birimini giriniz");
        char birim = scanner.next().charAt(0);

        if (birim == 'm'){
            System.out.println("Mesafe :  " + (mesafe*1000)+ " m dir..");
        } else if (birim == 'c') {
            System.out.println("Mesafe :  " + (mesafe*10000)+ " cm dir..");
        }else {
            System.out.println("birim sisteme kayitli degil");
        }


    }
}
