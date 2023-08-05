package C91_C105;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C105_For_Each_Loop {
    public static void main(String[] args) {

        /*Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.*/

        int[] array = {1, 2, 3, 4, 1, 2, 5};

        System.out.println(Arrays.toString(array));

        List<Integer> newarr = new ArrayList<>();


        for (int each:array
             ) {
            if (!newarr.contains(each)){
                newarr.add(each);
            }
        }
        System.out.println(newarr);


    }
}
