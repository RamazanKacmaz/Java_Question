package C61_C75;

import java.util.Scanner;

public class C61_Switch {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki basmakli bir sayi  giriniz...");
        int ikibasmakli = scanner.nextInt();

        switch (ikibasmakli){
            case 11 :
                System.out.println("onbir.");
                break;
            case 12 :
                System.out.println("oniki.");
                break;
            case 13 :
                System.out.println("onuc.");
                break;
            case 14 :
                System.out.println("ondort.");
                break;
            case 15 :
                System.out.println("onbes.");
                break;
            case 16 :
                System.out.println("onalti.");
                break;
            case 17 :
                System.out.println("onyedi.");
                break;
            case 18 :
                System.out.println("onsekiz.");
                break;
            case 19 :
                System.out.println("ondokuz.");
                break;
            default:
                System.out.println("yanlis giris bu sayi bir rakam degildir.");
        }

    }
}
