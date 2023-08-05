package C91_C105;

import java.util.ArrayList;
import java.util.List;

public class C103_Array_List {
    public static void main(String[] args) {

        /*Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        kismini list olarak bize donduren bir method olusturun*/

        yenicumle();
    }

    private static void yenicumle() {
        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};
        List<String> isimler = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            isimler.add(arr[i]);
        }
        System.out.println(isimler);

        System.out.println(istenmeyenisimlerisil(isimler,"a"));

        isimler = istenmeyenisimlerisil(isimler,"a");

    }

    private static List<String> istenmeyenisimlerisil(List<String> isimler, String a) {
        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i <isimler.size() ; i++) {

            if (!isimler.get(i).contains(a)){
                yeniList.add(isimler.get(i));
            }
        }
        return yeniList;
    }
}
