package C106_C120;

import java.util.ArrayList;
import java.util.Scanner;

public class C110_Bakkal_Gunluk_Kazanc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

// 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();

// 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        int gunIndex = 0;

        while (gunIndex < gunler.size()){
            String  gun = gunler.get(gunIndex);
            System.out.println(gun + " gunun kazancini giriniz");
            double kazanc = scanner.nextDouble();
            gunlukKazanclar.add(kazanc);

            gunIndex++;
        }
        System.out.println(gunlukKazanclar);

        // getOrtalamaKazanc();
        double ortalmakazanc = getOrtalmaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanc = " + ortalmakazanc + " TL");
        // getOrtalamaninUstundeKazancGunleri();
        ArrayList<String> usOrlamagunler = getortalmaninustundekazangunleri(gunler, gunlukKazanclar,ortalmakazanc);
        System.out.println("Ortalamanin ustundr kazanc gunleri : " + usOrlamagunler );

        ArrayList<String> ortalamaninaltindagunler = getortalamaninaltindagunler(gunler, gunlukKazanclar,ortalmakazanc);
        System.out.println("Ortalamanin altida gunler kazanc gunleri : " + ortalamaninaltindagunler );

    }

    private static ArrayList<String> getortalamaninaltindagunler(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalmakazanc) {
        ArrayList<String> altOrtalamGunler = new ArrayList<>();

        for (int i = 0; i <gunler.size() ; i++) {
            String gun = gunler.get(i);
            Double kazanc = gunlukKazanclar.get(i);

            if (kazanc<ortalmakazanc){
                altOrtalamGunler.add(gun);

            }
        }
        return altOrtalamGunler;
    }

    private static ArrayList<String> getortalmaninustundekazangunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalmakazanc) {
        ArrayList<String> usOrtalamGunler = new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            String gun = gunler.get(i);
            double kazanc = gunlukKazanclar.get(i);

            if (kazanc > ortalmakazanc){
                usOrtalamGunler.add(gun);
            }
        }
        return usOrtalamGunler;
    }

    private static double getOrtalmaKazanc(ArrayList<Double> gunlukKazanclar) {
        double toplamkazanc = 0.0;

        for (double each:gunlukKazanclar
        ) {
            toplamkazanc += each;
        }
        return toplamkazanc/gunlukKazanclar.size();
    }
}
