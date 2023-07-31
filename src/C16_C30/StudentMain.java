package C16_C30;

import java.util.Scanner;

public class StudentMain {
    /*
       Soru 44-)
       StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul)
       Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun, bu parametreler
       Maın classdaki bılgılerı ıstesın.
       Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
       Ardından consolda giriilen bilgileri yazdırın
       Ipucu:
       Bu soruda iki classa ihtiyacımız olacak.
       Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
       String isim, int yas, char cinsiyet gibi...
       Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
       bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
       Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız
       ve tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek,
       bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
    */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String ad = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyad = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Lutfen cinisyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);

        Student ogrenci1 = new Student(ad,soyad,yas,cinsiyet);

        System.out.println(ogrenci1);
    }
}
