package C106_C120;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class C108_For_Each_Loop {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.*/

        String cumle = "Jaxa her gecen gun daha zevkli hale geliyox";

        String harf = "x";

        int sayac = 0;

        String [] cumlearr = cumle.split("");

        for (String each: cumlearr
             ) {
            if (each.equals(harf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aradiginiz harf cumlede kullanilmamistir.");
        }else {
            System.out.println("Aradiginiz harf cumlede " + sayac + " kere kullanilmis..");
        }
    }
}
