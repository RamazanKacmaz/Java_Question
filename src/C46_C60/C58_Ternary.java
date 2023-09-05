package C46_C60;

import java.util.Scanner;

public class C58_Ternary {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayi girniz..");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sonuc = sayi1 > sayi2 ? sayi2 : sayi1;
        int sonuc2 = Math.min(sayi1, sayi2);
        int sonuc3 = Math.max(sayi1,sayi2);
        System.out.println(sonuc);
        System.out.println("_____________________");
        System.out.println(sonuc2);
        System.out.println("----------------------------");
        System.out.println(sonuc3);

    }
}
