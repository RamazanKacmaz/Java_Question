package C61_C75;

import java.util.Scanner;

public class C63_Switch {
    public static void main(String[] args) {
       /* Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        ve girilen harfin karsiligini yazdirin.
                I : International S : Software T : Testing Q : Qualifications B: Board*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  ISTQB  anlamini ogrenmek istedigin harfi gir....");
        char istop = scanner.next().charAt(0);

        switch (istop){
            case 'I' :
                System.out.println("I : International ");
                break;
            case 'S' :
                System.out.println("S : Software ");
                break;
            case 'T' :
                System.out.println("T : Testing");
                break;
            case 'Q' :
                System.out.println("Q : Qualifications ");
                break;
            case 'B' :
                System.out.println("B: Board ");
                break;
            default:
                System.out.println("Yanlis harf girdiniz...");
        }

    }
}
