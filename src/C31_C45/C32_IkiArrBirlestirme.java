package C31_C45;

import java.util.ArrayList;
import java.util.List;

public class C32_IkiArrBirlestirme {
    /*Soru 40-)
    Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir
    Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}*/
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] mergedArray = mergeArray(arr1 , arr2);

        for ( int num : mergedArray){
            System.out.println(num + "");
        }






    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {

        List<Integer> mergeList = new ArrayList<>();
        for (int num : arr1){
            mergeList.add(num);
        }

        for (int num : arr2){
            mergeList.add(num);
        }

        int [] mergedArray = new int[mergeList.size()];

        for (int i = 0; i <mergeList.size() ; i++) {
           mergedArray[i] = mergeList.get(i);
        }
        return mergedArray;
    }
}
