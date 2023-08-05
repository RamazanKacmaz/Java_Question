package C91_C105;

import java.util.Arrays;

public class C95_Arrays {
    public static void main(String[] args) {

        /*Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.*/

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Eski dizi: " + Arrays.toString(array));
        int elementToAdd = 6;
        int[] newArray = addElement(array, elementToAdd);

        System.out.println("Yeni dizi: " + Arrays.toString(newArray));
    }

    private static int[] addElement(int[] arr, int elementToAdd) {

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = elementToAdd;

        return newArr;
    }


}
