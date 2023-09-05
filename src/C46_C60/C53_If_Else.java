package C46_C60;

import java.util.Scanner;

public class C53_If_Else {
    /*Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz..");
        int yil = scanner.nextInt();

        if (yil % 4 != 0){
            System.out.println("Artik yil degil");
        } else if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println("Artik yil'dir...");
        } else if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Artik Yil dir...");
        }
    }
}
