package C46_C60;

import java.util.Scanner;

public class C51_If_Else {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldiginiz urun adedi girin");
        int urunAdedi = scanner.nextInt();
        System.out.println("Lütfen urunu fiat listesini giriniz..");
        int fiatlistesi = scanner.nextInt();
        System.out.println("Kullanici karti var mi giriniz varsa E yoksa H yaziniz");
        char kart = scanner.next().charAt(0);

        if (kart == 'E' && urunAdedi > 10){
            System.out.println("%20 inidrim aldiniz... " + ((urunAdedi*fiatlistesi)*20 )/100 + " Tl Indirim aldiniz..");
        } else if (kart == 'E' && urunAdedi <  10) {
            System.out.println("%15 indirim aldiniz... " + ((urunAdedi*fiatlistesi)*15 )/100 + " Tl Indirim aldiniz..");
        } else if (kart == 'H' && urunAdedi > 10) {
            System.out.println("%15 indirim aldiniz... " + ((urunAdedi*fiatlistesi)*15 )/100 + " Tl Indirim aldiniz..");
        } else if (kart == 'H' && urunAdedi < 10) {
            System.out.println("%10 indirim aldiniz... " + ((urunAdedi*fiatlistesi)*10 )/100+ " Tk Indirim aldiniz..");
        }

    }
}
