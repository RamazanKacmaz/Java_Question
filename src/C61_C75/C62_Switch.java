package C61_C75;

import java.util.Scanner;

public class C62_Switch {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  bir ay  giriniz...");
        int monat = scanner.nextInt();

        switch (monat){
            case 1 :
                System.out.println("OCAK");
                break;
            case 2 :
                System.out.println("SUBAT");
                break;
            case 3 :
                System.out.println("MART");
                break;
            case 4 :
                System.out.println("NISAN");
                break;
            case 5 :
                System.out.println("MAYIS");
                break;
            case 6 :
                System.out.println("HAZIRAN");
                break;
            case 7 :
                System.out.println("TEMMUZ");
                break;
            case 8 :
                System.out.println("AGISTOS");
                break;
            case 9 :
                System.out.println("EYLÜL");
                break;
            case 10 :
                System.out.println("EKIM");
                break;
            case 11 :
                System.out.println("KASIM");
                break;
                case 12 :
                System.out.println("ARALIK");
                break;

            default:
                System.out.println("yanlis giris bu bir ay degildir.");
        }
    }
}
