package C01_C15;

import java.util.Locale;
import java.util.Scanner;

public class C01_übung {

    public static void main(String[] args) {

        //(Variables ve Scanner)

    /*Soru 1- Kullanicidan uc farkli data turunde deger alip,
    girilen degerleri aciklamalariyla
    yazdirin.*/

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Lütfen adinizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println("Lütfen kilonuzu giriniz.");
        double kilo = scanner.nextDouble();
        System.out.println("isim : " + isim + "\nYasiniz : " + yas + "\nKilonz : " + kilo);*/

        /*Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        yazdirin.*/

       /* System.out.println("dbl sayi giriniz");
        double dbl = scanner.nextDouble();
        System.out.println("int sayi girniz");
        int sayi = scanner.nextInt();
        System.out.println("Toplam = " + (dbl + sayi));
        System.out.println("Carpim = " + ( dbl* sayi));*/

        /*Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.*/

        /*System.out.println("Isminizi giriniz : ");
        String isim = scanner.nextLine();
        System.out.println("Soyismnizi giriniz : ");
        String soyIsim = scanner.nextLine();
        System.out.println("Yasinizi giriniz : ");
        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyIsim);
        System.out.println("YAsiniz : " + yas);*/

        /*Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        yazdirin.*/

        /*System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu giriniz");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();

        System.out.println("Dikdorgenin Alani = " + (kenar1*kenar2));*/

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
        /*System.out.println("Lütfen cemberin yari capini giriniz :");
        int yaricap = scanner.nextInt();

        System.out.println("Yaricap = " + (yaricap*2*3.14));
        System.out.println("Alani = " + ( yaricap*yaricap*3.14));*/

        //****** Sorular (Data Casting) ****** //

        /*Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
                yazin*/

        /*int sayi1 = 20;
        int sayi2 = 14;
        int sayi3 = 32;
        double ortalama = (sayi1+sayi2+sayi3) / 2 ;
        System.out.println(ortalama);*/

        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        /*System.out.println("Lutfen bir harf giriniz :");

        char girilenHarf = scanner.next().charAt(0);

        char sonrakinew = (char) (girilenHarf + 3);

        char sonraki1 = (char) (girilenHarf + 1) ;
        char sonraki2 = (char) (girilenHarf + 2);
        char sonrai3 = (char) (girilenHarf +3 );
        //System.out.println( "girilenharf = " + girilenHarf + " sonraki harfler = " + sonraki1+ sonraki2+ sonrai3);

        System.out.println(sonrakinew);*/

        /*Soru 3-Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        ile 127 arasindaki bir sayiya donusturup yazdirin.*/

        /*System.out.println("Lutfen bir sayi girniz : ");
        int sayi = scanner.nextInt();
        byte newsayi = (byte) sayi;
        System.out.println(newsayi);*/

        /*Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        isleminin sonucununun tamsayi kismini yazdirin.*/

       /* System.out.println("Lutfen dbl sayi giriniz");
        double say1 = scanner.nextDouble();
        double say2 = scanner.nextDouble();
        int bolum =  (int) (say1 / say2 );
        System.out.println(bolum);*/


        // Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        /*System.out.println("ondalik sayi giriniz.");
        double dbl = scanner.nextDouble();
        System.out.println("tam sayi giriniz");
        int tamsayi = scanner.nextInt();
        int sonuc = (int) (dbl / tamsayi);
        System.out.println("sonuc = " + sonuc);*/

        ///***  Modulus Soru ***\\\

        // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        /*System.out.println("dort basanakli bir sayi giriniz :");
        int sayi = scanner.nextInt();

        if (sayi < 1000 && sayi > 9999){
            System.out.println("Lütfen 4 basamakli bir sayi giriniz");
            return;
        }
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;
        int binler = sayi / 1000;
        int toplam = birler + onlar + yuzler + binler;
        System.out.println("Rakamlar toplamı: " + toplam);*/

        /*Soru 1 - Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati”yazdirin.*/

        /*System.out.println("Lütfen bir sayi girniz");
        int sayi = scanner.nextInt();
        if (sayi % 5 == 0){
            System.out.println("Sayi 5’in tam kati");
        }*/

        /*Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.*/
        /*System.out.println("Lutfen bir harf giriniz");
        char harf;
        harf = scanner.next().charAt(0);

        if (harf == 'o'){
            System.out.println("ocak");
        } else if (harf == 's') {
            System.out.println("subat");
        } else if (harf == 'm') {
            System.out.println("mart");
        }*/

       // Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
       // sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        /*System.out.println("Lütfen bir sayi giriniz..");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0){
            System.out.println("sayi uce bolunebilir");
        } else if (sayi % 5 == 0) {
            System.out.println("sayi 5 bolunur");
        }*/

        /*Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin.*/

        /*System.out.println("Lütfen uc kenar yazin :");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Eskenar ucgen");
        }*/

       /* Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.*/

       /* System.out.println("Lütfen notunuzu giriniz :");
        double notu = scanner.nextDouble();

        if ( notu > 50){
            System.out.println("Sinifi gectin");
        } else if (notu < 50) {
            System.out.println("kaldin");
        }*/

       /// ***  If Else Statements Sorular *** \\\

        /*Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.*/

       /* System.out.println("Lutfen uc kenar uzunlugu yazin");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Eskenar ucgendir.");
        }else {
            System.out.println("Eskanarucgen degildir...");
        }*/

        /*Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.*/

        /*System.out.println("Lütfen notunuzu girniniz");
        int not = scanner.nextInt();

        if ( not > 50 ){
            System.out.println("Gectiniz tebrikler");
        }else {
            System.out.println("Kaldiniz malesef ");
        }*/

        /*Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.*/

        /*System.out.println("Lütfeen yasinizi giriniz..");
        int yas = scanner.nextInt();

        if (yas > 65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olmak micin * " + (65-yas) + " * yil daha calismalisiniz");
        }*/

        /*Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        olup olmadigini yazdirin.*/

        /*System.out.println("Lütfen bir krakter giriniz");
        char krakter = scanner.next().charAt(0);

        if ( krakter >= 'A' && krakter <= 'Z' ){
            System.out.println("Buuyk harf");
        }else {
            System.out.println("Kucuk harf");
        }*/

        /*Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        olarak yazdirin, yoksa girilen harfi yazdirin*/

        /*System.out.println("Lütfen bir krakter giriniz");
        char harf = scanner.next().charAt(0);

        if (harf >= 'a' && harf <= 'z'){
            harf = Character.toUpperCase(harf);
            System.out.println(harf);
        }else {
            System.out.println(harf);
        }*/

        /*Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

       /* System.out.println("Cinsiyetinizi yaziniz");
        String cinsiyet = scanner.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet.equalsIgnoreCase ("Kadin") && yas >= 60){
            System.out.println("Emekli olabilirsin");
            } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas >= 65) {
            System.out.println("Emekli olabilirsin");
        }else {
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                int kalanyil = 60-yas;
                System.out.println("Emekli olmak icin " + kalanyil);
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                int kalanyil = 65 - yas ;
                System.out.println("Emekli olmak icin " + kalanyil);
            }else {
                System.out.println("yanlis girginiz....");
            }
        }*/

       /* Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.*/

        /*System.out.println("Lutfen kilonuzu giriniz");
        int kilo = scanner.nextInt();

        System.out.println("Lutfen bouyubujzu giriniz ");
        int boy = scanner.nextInt();

        int kitle = (kilo*10000)/(boy*boy);

        if (kitle > 30){
            System.out.println("OBEZ");
        } else if (kitle > 25) {
            System.out.println("kilolu");
        } else if (kitle > 20) {
            System.out.println("Normal");
        }else {
            System.out.println("zayif");
        }*/

       /* Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
                %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin*/

        /*System.out.println("Müsteri karti var mi");
        String kart = scanner.nextLine();

        System.out.println("Lütfen aldiginiz urun addeidini girin");
        int adet = scanner.nextInt();

        System.out.println("Lütfen liste fiatini girniz :");
        int fiat = scanner.nextInt();


        if (kart.equalsIgnoreCase("Evet") && adet > 10){
            System.out.println("%20 indirim kazandiniz " + (((fiat *adet) *20) / 100));
        } else if (kart.equalsIgnoreCase("evet") && adet < 10) {
            System.out.println("% 15 inidrim kazandiniz " + (((fiat *adet) *15) / 100));
        } else if (kart.equalsIgnoreCase("hayir") && adet > 10) {
            System.out.println("% 15 indirim " + (((fiat *adet) *15) / 100));
        } else if (kart.equalsIgnoreCase("hayir") && adet < 10) {
            System.out.println("inidirm % 10 " +(((fiat *adet) *10) / 100));
        }*/

        /*Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        “istediginiz birim sisteme kayitli degil” yazdirin.*/

        /*System.out.println("Lütfen cevirmek isteedginiz biriimi girin");
        String birim = scanner.nextLine();

        System.out.println("lütfen mesafeyi km olarak giriniz: ");
        int km = scanner.nextInt();

        if (birim.equalsIgnoreCase("cm")){
            System.out.println("cm olarak = " + (km * 10000));
        } else if (birim.equalsIgnoreCase("metre")) {
            System.out.println("metre olarak " + (km * 1000));
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }*/

        /*System.out.println("Lütfen yil giriniz...");
        int yil = scanner.nextInt();

        if (!(yil % 4 == 0)){
            System.out.println("artik yil degil");
        } else if (yil % 4 == 0 && !(yil % 100 == 0)) {
            System.out.println("artik yildir..");
        } else if (yil % 4 == 0 && yil % 100 == 0 && yil > 400) {
            System.out.println("artik yildir...");
        }*/
       /* Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        zamani” yazdirin.*/


       /* System.out.println("Lütfen gün ismi giriniz ..");
        String gunler = scanner.nextLine();

        if (gunler.equalsIgnoreCase("pazartesi") || gunler.equalsIgnoreCase("Sali") || gunler.equalsIgnoreCase("Carsamba") || gunler.equalsIgnoreCase("persembe") || gunler.equalsIgnoreCase("cuma")){

            System.out.println("Simdi calisma zamani tatile" +  "gun var");*/

                      /// *** Switch Statements ***\\\

        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        /*System.out.println("Lütfen bir rakam giriniz :");
        int sayi = scanner.nextInt();

        switch (sayi){
            case 0 :
                System.out.println("sifir");
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            case 3 :
                System.out.println("uc");
                break;
            case 4 :
                System.out.println("dört");
                break;
            case 5 :
                System.out.println("bes");
                break;
            case 6 :
                System.out.println("alti");
                break;
            case 7 :
                System.out.println("yedi");
                break;
            case 8 :
                System.out.println("sekiz");
                break;
            case 9 :
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Bu bir rakam degil");

        }*/

      //  Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        /*System.out.println(" Lütfen ay numarasini giriniz :");
        int ay = scanner.nextInt();

        switch (ay){
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ilkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("gecersiz");
        }*/

                 /// *** String Manipulations *** \\\

        /*Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin*/

       /* System.out.println("Lütfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev")) {
            System.out.println("Hem ev lazim hem is");
        } else {
            System.out.println("cok calisman lazim");
        }*/

        /*Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70 €    */

       /*String fiat1 = "15,30";
       String fiat2 = "11.40";

       double fiat3 = Integer.parseInt(fiat1);
       double fiat4 = Integer.parseInt(fiat2);

        System.out.println(fiat3);*/

       /* Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.*/


        /*String metin = " java1 ogRe2@nMek3 #ne +Gu=zel";

        metin = metin.replaceAll("\\d","");
       // metin = metin.replaceAll("\\s", "");
        metin = metin.toLowerCase();
        metin = metin.replaceFirst("j","J");
        metin = metin.replaceAll("\\W","");


        System.out.println(metin);*/

       /* Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
        - son karakter rakam olmali
                - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali/*
        */

        /*System.out.println("Lütfen bir sifre giriniz");
        String sifre = scanner.nextLine();

        boolean flag = true;

        char ilkharf = sifre.charAt(0);

        if (!(ilkharf >= 'a' && ilkharf <= 'z')){
            System.out.println("Ilk karakter kucuk kakter olamli");
            flag = false;
        }

        char sonkrater = sifre.charAt(sifre.length()-1);

        if (!(sonkrater > '0' && sonkrater <= '9')){
            System.out.println("son krater rakam olmali");
            flag = false;
        }

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = false;
        }

        if (!(sifre.length() >= 10)){
            System.out.println("En az on krater olmai");
            flag = false;
        }

        if (flag){
            System.out.println("Sifre basarili sekilde kaydedildi");
        }*/

       /* Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.*/

        /*System.out.println("Lutfen isminizi girnizi");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length()){

            System.out.println( "isim : " + isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase() + " Soyisim : " + soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());
        } else if (isim.length() < soyisim.length()) {

            System.out.println( "Isim : "+ isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+ " Soyisim : " + soyisim.toUpperCase());
        }*/

        /*Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin.*/

        /*System.out.println("Lütfen bir metin giriniz..");
        String metin = scanner.nextLine();

        if (metin.length() % 2 == 0){
            int orta = metin.length() / 2 ;
            System.out.println(metin.substring(0,orta) + ":)" + metin.substring(orta) );
        }else {
            int orta = metin.length() / 2 ;
            System.out.println(metin.substring(0,orta)+ "(:" + metin.substring(orta +1));
        }*/

                     /// *** For Loops *** \\\

        /*Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        yazdirin.*/

        /*for (int i = 1; i < 100 ; i++) {
            System.out.print(i + " ");
        }*/

        /*Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.*/

        /*System.out.println("Pozitif bir tam sayi aliniz ...");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if (i % 7 == 0){
                System.out.print(i + " ");
            }
            //System.out.print("");

        }*/

      /*  Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin */

       /* System.out.println("baslangic degeri girin..");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis degeri yaziniz...");
        int bitis = scanner.nextInt();
        int toplam = 0;
        if (baslangic < bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i ;
            }
        }else {
            System.out.println("uyarirrrrrrrr");
        }
        System.out.print(toplam);*/

       /* Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk olsa da program calissin*/

        /*System.out.println("baslangic degeri girin..");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis degeri yaziniz...");
        int bitis = scanner.nextInt();
        int toplam = 0;

       if (baslangic < bitis){
           for (int i = baslangic; i <= bitis; i++) {
               toplam += i ;
           }
       }else {
           for (int i = bitis; i <= baslangic ; i++) {
               toplam += i ;
           }
       }
        System.out.println(toplam);*/

        /*Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin.*/

        /*System.out.println("20 den kucuk bir sayi girniz :");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i < sayi ; i++) {
            faktoriyel *= i ;
        }
        System.out.println("Fakroriyel = " + faktoriyel);*/

       /* Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720*/

        /*System.out.println("20 den kucuk bir sayi girniz :");

        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi ; i++) {
            faktoriyel *= i ;
            System.out.print(i + " * ");


        }
        System.out.println("");
        System.out.println("Fakroriyel = " + faktoriyel);*/

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        /*System.out.println("sayi giriniz :::");
        int sayi = scanner.nextInt();

        int toplam = 0 ;

        for (int i = 0; i <= sayi ; i++) {
            toplam += i ;
        }
        System.out.println(toplam);*/

        /*Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        yazdirin*/

        /*System.out.println("Lutfen bir pozitif bir tamsayi giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(" fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" fizz ");
            } else if (i % 5 == 0 ) {
                System.out.print(" buzz ");
            }else {
                System.out.print(i + " ");
            }
        }*/

    }
}
