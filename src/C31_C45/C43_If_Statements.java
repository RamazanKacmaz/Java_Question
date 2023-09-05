package C31_C45;

import java.util.Scanner;

public class C43_If_Statements {
    public static void main(String[] args) {

       /* Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girniiz..");
        int not = scanner.nextInt();

        if (not >= 50){
            System.out.println("Sinifi gectin...");
        }else {
            System.out.println("Kaldin....");
        }
    }
}
