package C106_C120;

import java.util.ArrayList;
import java.util.List;

public class C106_For_Each_Loop {
    public static void main(String[] args) {
        /*Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        yazdiran bir method olusturun.*/
        int[] array = {1, 2, 3, 4, 1, 2, 5};
        int kareleritoplami = hesapla(array);


        System.out.println(kareleritoplami);
    }

    private static int hesapla(int[] array) {
        int sum = 0;

        for (int each:array
             ) {
            int square =each*each;
            sum += square;
        }
        return sum;
    }



}
