package C106_C120;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C09_For_Each_Loop {
    public static void main(String[] args) {
        /*Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri
        ayri bir liste olarak veren bir program yazin.*/

        Integer[] arr1 = {3,5,8,1,3,9,2,4,7,13,15};
        Integer[] arr2 = {2,7,3,5,8,1,9,0,3,52,17};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (Integer each1:arr1
             ) {
            for (Integer each2:arr2
                 ) {
                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each1);
                }
            }
        }
        Collections.sort(ortakElemanlarListesi);
        System.out.println(ortakElemanlarListesi);
    }
}
