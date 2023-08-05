package C106_C120;

import java.util.ArrayList;
import java.util.List;

public class C107_For_Each_Loop {
    public static void main(String[] args) {
       /* Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.*/

        String [] liste = {"Ali" , "Veli" , "Deli", "Semsi"};

        List<String> newliste = yeniaskilegel(liste);
        System.out.println(newliste);

    }

    private static List<String> yeniaskilegel(String[] liste) {

        List<String> modifiylist = new ArrayList<>();

        for (String word:liste
             ) {
            int length = word.length();
            String modifieWord;
            if (length % 2 == 0){
                modifieWord = word.substring(0,length/2);
            }else {
                int midIndex = length/2;
                modifieWord = word.substring(midIndex);
            }
            modifiylist.add(modifieWord);

        }
        return modifiylist;
    }
}
