package C01_C15;

import java.util.Scanner;

public class C10_Burc {
    /*Soru 19-)  Method Sorusu
    Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
            ipucu:
    Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dogdugunuz ayi giriniz...");
        int ay = scanner.nextInt();
        System.out.println("Lütfen dogdugunuz gunu giriniz...");
        int gun = scanner.nextInt();
        System.out.println(burc(gun, ay));

    }

    public static String burc(int gun , int ay) {
        String burc = "";

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <=20) ){
            burc = "Koc";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <=20)) {
            burc = "Boga";
        } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <=20)) {
            burc = "Ikizler";
        } else if ((ay == 6 && gun >= 21) || (ay == 7 && gun <=20)) {
            burc = "Yengec";
        } else if ((ay == 7 && gun >= 21) || (ay == 8 && gun <=20)) {
            burc = "Aslan";
        } else if ((ay == 8 && gun >= 21) || (ay == 9 && gun <=20)) {
            burc = "Basak";
        } else if ((ay == 9 && gun >= 21) || (ay == 10 && gun <=20)) {
            burc = "Terazi";
        } else if ((ay == 10 && gun >= 21) || (ay == 11 && gun <=20)) {
            burc = "Akrep";
        } else if ((ay == 11 && gun >= 21) || (ay == 12 && gun <=20)) {
            burc = "Yay";
        } else if ((ay == 12 && gun >= 21) || (ay == 1 && gun <=20)) {
            burc = "Oglak";
        } else if ((ay == 1 && gun >= 21) || (ay == 2 && gun <=20)) {
            burc ="Kova";
        } else if ((ay == 2 && gun >= 21) || (ay == 3 && gun <=20)) {
            burc = "Balik";
        }else {
            System.out.println("Gecersiz giris...");
        }
        return burc;
    }
}
