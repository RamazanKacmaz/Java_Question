package C46_C60;

import java.util.Scanner;

public class C57_Ternary {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen not girniz..");
        int not = scanner.nextInt();

        String sonuc = not > 50 ? "Sniifi gectin" : "Kaaldun";
        System.out.println(sonuc);
    }
}
