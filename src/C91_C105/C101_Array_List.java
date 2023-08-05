package C91_C105;

import java.util.Arrays;
import java.util.HashSet;

public class C101_Array_List {
    public static void main(String[] args) {

        /*Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.*/

        int[] array = {1, 2, 3, 4, 1, 2, 5};
        System.out.println("Girdi: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Çıktı: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        // Dizideki elemanları unique (tekrarsız) hale getiren bir HashSet kullanıyoruz
        HashSet<Integer> uniqueSet = new HashSet<>();

        // HashSet'e elemanları ekliyoruz, tekrar eden elemanlar otomatik olarak eklenmeyecektir
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // HashSet'teki unique elemanları tekrar bir diziye ekliyoruz
        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            result[index++] = num;
        }

        return result;
    }


}
