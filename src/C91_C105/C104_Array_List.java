package C91_C105;

import java.util.ArrayList;
import java.util.List;

public class C104_Array_List {
    public static void main(String[] args) {
        /*Soru 6- Kullanicidan pozitif bir tamsayi alip,
         o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.*/
        System.out.println(pozitiftambolneler(40));

    }

    private static List<Integer> pozitiftambolneler(int sayi) {
        List<Integer> tambolenler = new ArrayList<>();

        for (int i = 1; i < sayi ; i++) {
            if (sayi % i == 0){
                tambolenler.add(i);
            }
        }
        return tambolenler;
    }
}
