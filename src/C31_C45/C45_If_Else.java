package C31_C45;

import java.util.Scanner;

public class C45_If_Else {
    /*Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
    kucukse “Maalesef kaldin” yazdirin.*/
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girniiz..");
        int not = scanner.nextInt();

        if (not >= 50){
            System.out.println("Sinifi gectin...");
        }else {
            System.out.println("Malesef Kaldin....");
        }
    }
}
