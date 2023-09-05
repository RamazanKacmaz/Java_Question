package C31_C45;

import java.util.Scanner;

public class C38_Data_Casting {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        ve bolum isleminin sonucununun tamsayi kismini yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir double sayi giriniz...");
        double dbl = scanner.nextDouble();
        System.out.println("_______________________________");
        System.out.println("Lütfen bir int sayi giriniz....");
        int sayi = scanner.nextInt();

        int bolum = (int) (dbl / sayi);
        System.out.println("Reult : " + bolum + " yarisi : "+ (bolum/2));


    }
}
